package com.amplitude.tron.volksradio30;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Tron on 1/27/2017.
 */

public class VolksPlayerService extends Service implements MediaPlayer.OnPreparedListener,
        MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener,MediaPlayer.OnSeekCompleteListener,
        MediaPlayer.OnCompletionListener {

    private static final String ACTION_PLAY = "com.amplitude.tron.volksradio30.PLAY";
    private static final String ACTION_STOP = "com.amplitude.tron.volksradio30.STOP";

    MediaPlayer volksMediaPlayer=new MediaPlayer();
    Intent intentNotificationService;
    AudioManager volksAudioManger;
    Context context;
    //NOISY HANDLER
    BecomingNoisyReceiver volksNoisyReceiver;
    private IntentFilter intentFilter;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        //INITIALIZE THE VARIABLES
        intentNotificationService = new Intent(getApplicationContext(),VolksNotificationService.class);
        volksAudioManger = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        volksNoisyReceiver=new BecomingNoisyReceiver();
        intentFilter = new IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY);

        context=getApplicationContext();

        if (intent.getAction().equals(ACTION_PLAY)) {
            volksMediaPlayer.reset();//for safe replay
            try{
                String url= NowStreamingRadio.getCurrentRadioUrl(getApplicationContext());
                if (url.equals("unavailable")){

                    Toast.makeText(context, "Select a stream to play!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    pushUIChangeOnBufferStart();

                    if (VolksMediaConstant.getIsNewPush())
                    {
                        volksMediaPlayer.reset();//for safe replay
                        volksMediaPlayer.setLooping(false);
                        volksMediaPlayer.setDataSource(url);
                    }
                    else
                    {
                        volksMediaPlayer.setLooping(false);
                        volksMediaPlayer.setDataSource(url);
                    }
                    volksMediaPlayer.prepareAsync(); // prepare async to not block main thread
                    volksMediaPlayer.setOnPreparedListener(this);
                    volksMediaPlayer.setOnErrorListener(this);
                    volksMediaPlayer.setOnInfoListener(this);
                    volksMediaPlayer.setOnSeekCompleteListener(this);
                    volksMediaPlayer.setOnCompletionListener(this);
                    /*volksMediaPlayer.setOnBufferingUpdateListener(this);*/

                }
                //volksMediaPlayer.setDataSource("http://mp3channels.webradio.antenne.de:80/top-40");
            }
            catch (Exception e)
            {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                e.printStackTrace();
                volksMediaPlayer.stop();
                volksMediaPlayer.reset();
                pushUIChangeOnStop();
            }
        }
        else if (intent.getAction().equals(ACTION_STOP)){
            if (volksMediaPlayer.isPlaying())
            {
                volksMediaPlayer.stop();
                volksMediaPlayer.reset();
                pushUIChangeOnStop();
            }
        }
        return START_STICKY;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        this.volksMediaPlayer=mp;
        PhoneStateListener phoneStateListener = new PhoneStateListener() {
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                if (state == TelephonyManager.CALL_STATE_RINGING) {
                    //Incoming call: Pause music
                    volksMediaPlayer.pause();
                    //volksMediaPlayer.reset();
                    pushUIChangeOnStop();
                    //CALL INTERRUPTION DO SOMETHING IN UI
                } else if(state == TelephonyManager.CALL_STATE_IDLE) {
                    //Not in call: Play music
                    int result = volksAudioManger.requestAudioFocus(focusChangeListener,
                            // Use the music stream.
                            AudioManager.STREAM_MUSIC,
                            // Request permanent focus.
                            AudioManager.AUDIOFOCUS_GAIN);

                    if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                        // other app had stopped playing song now , so u can do u stuff now .
                        volksMediaPlayer.start();
                        callback.onPlay();
                        pushUIChangeOnPlay();
                        Toast.makeText(context, "Playing the awesome!", Toast.LENGTH_SHORT).show();
                    }
                    else if (result==AudioManager.AUDIOFOCUS_REQUEST_FAILED)
                    {
                        volksMediaPlayer.stop();
                        volksMediaPlayer.reset();
                        pushUIChangeOnStop();
                    }
                } else if(state == TelephonyManager.CALL_STATE_OFFHOOK) {
                    //A call is dialing, active or on hold
                    volksMediaPlayer.stop();
                    volksMediaPlayer.reset();
                    pushUIChangeOnStop();
                }
                super.onCallStateChanged(state, incomingNumber);
            }
        };
        TelephonyManager mgr = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        if(mgr != null) {
            mgr.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);
        }
        volksMediaPlayer.start();
    }

    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {

        switch (what) {
            case MediaPlayer.MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK:
                Toast.makeText(this, "Playback Error", Toast.LENGTH_LONG).show();
                break;
            case MediaPlayer.MEDIA_ERROR_TIMED_OUT:
                Toast.makeText(this, "Broken Connection", Toast.LENGTH_LONG).show();
                break;
            case MediaPlayer.MEDIA_ERROR_IO:
                Toast.makeText(this, "Media Error", Toast.LENGTH_LONG).show();
                break;
            case MediaPlayer.MEDIA_ERROR_MALFORMED:
                Toast.makeText(this, "Playback Error", Toast.LENGTH_LONG).show();
                break;
            case MediaPlayer.MEDIA_ERROR_SERVER_DIED:
                Toast.makeText(this, "Server Time out", Toast.LENGTH_LONG).show();
                break;
            default:
                System.out.println("Playback Error");
        }
        System.out.println("IS IN ON ERROR BLOCK");
        volksMediaPlayer.stop();
        volksMediaPlayer.reset();
        pushUIChangeOnStop();
        return false;
    }

//    //ON BUFFERING UPDATE LISTENER
//    @Override
//    public void onBufferingUpdate(MediaPlayer mp, int percent) {
//        pushUIChangeOnBufferStart();
//
//        if(percent == 100)
//            pushUIChangeOnPlay();
//
//    }

    //ON INFO LISTENER
    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        switch (what){
            case MediaPlayer.MEDIA_INFO_BUFFERING_START:
                pushUIChangeOnBufferStart();
                break;
            case MediaPlayer.MEDIA_INFO_BUFFERING_END:
                pushUIChangeOnPlay();
                break;
            case MediaPlayer.MEDIA_INFO_UNKNOWN:
                volksMediaPlayer.stop();
                volksMediaPlayer.reset();
                pushUIChangeOnStop();
                break;
        }
        return false;
    }

    //AUDIO FOCUS CHANGE LISTENER HELPS SMOOTH TRANSITION OF FOCUS FROM ONE APP TO THE OTHER
    private AudioManager.OnAudioFocusChangeListener focusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int focusChange) {
                    switch (focusChange) {

                        case (AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK):
                            // Lower the volume while ducking.
                            volksMediaPlayer.setVolume(0.2f, 0.2f);
                            break;
                        case (AudioManager.AUDIOFOCUS_LOSS_TRANSIENT):
                            volksMediaPlayer.pause();
                            break;
                        case (AudioManager.AUDIOFOCUS_LOSS):
                            //callback.onStop();
                            volksMediaPlayer.stop();
                            volksMediaPlayer.reset();
                            pushUIChangeOnStop();
                            break;
                        case (AudioManager.AUDIOFOCUS_GAIN):
                            try
                            {
                                volksMediaPlayer.setVolume(1f, 1f);
                                volksMediaPlayer.start();
                            }
                            catch (Exception e)
                            {
                                Log.e("volksradio22", "Exception: "+Log.getStackTraceString(e));
                                volksMediaPlayer.stop();
                                volksMediaPlayer.reset();
                                pushUIChangeOnStop();
                            }
                            break;
                    }
                }
            };

    @Override
    public void onSeekComplete(MediaPlayer mp) {
        volksMediaPlayer.stop();
        volksMediaPlayer.reset();
        pushUIChangeOnStop();
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        volksMediaPlayer.stop();
        volksMediaPlayer.reset();
        pushUIChangeOnStop();
    }

    //HEADPHONE REMOVAL HANDLER
    private class BecomingNoisyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (AudioManager.ACTION_AUDIO_BECOMING_NOISY.equals(intent.getAction())) {
                volksMediaPlayer.stop();
                volksMediaPlayer.reset();
                pushUIChangeOnStop();
            }
        }
    }

    //USING MEDIA SESSION REGISTER YOUR AUDIO OUTPUT HARDWARE
    MediaSessionCompat.Callback callback = new
            MediaSessionCompat.Callback() {
                @Override
                public void onPlay() {
                    registerReceiver(volksNoisyReceiver, intentFilter);
                }

                @Override
                public void onStop() {
                    unregisterReceiver(volksNoisyReceiver);
                }
            };

    //UI UPDATE PUSHER METHODS
    private void pushUIChangeOnStop() {
        VolksMediaConstant.setIsStreamPlaying(false);
        VolksSysSharedPrefs.setNowStreamingStatus(getApplicationContext(),false);
        VolksSysSharedPrefs.setIsBufferingStatus(getApplicationContext(),false);
        VolksMediaConstant.setIsStreamBuffering(false);
        PlayerUIConstant.setIsUIConnectedState(true);
        intentNotificationService.setAction("com.amplitude.tron.volksradio30.STOPPED");
        startService(intentNotificationService);
    }

    private void pushUIChangeOnPlay() {
        VolksMediaConstant.setIsStreamPlaying(true);
        VolksSysSharedPrefs.setNowStreamingStatus(getApplicationContext(), true);
        VolksMediaConstant.setIsStreamBuffering(false);
        VolksSysSharedPrefs.setIsBufferingStatus(getApplicationContext(),false);
        intentNotificationService.setAction("com.amplitude.tron.volksradio30.PLAYING");
        startService(intentNotificationService);
    }

    private void pushUIChangeOnBufferStart()
    {
        VolksSysSharedPrefs.setIsBufferingStatus(getApplicationContext(),true);
        VolksMediaConstant.setIsStreamBuffering(true);
        intentNotificationService.setAction("com.amplitude.tron.volksradio30.BUFFERING");
        startService(intentNotificationService);
    }

    @Override
    public void onDestroy(){

        //callback.onStop();
        volksMediaPlayer.release();
        super.onDestroy();
    }
}
