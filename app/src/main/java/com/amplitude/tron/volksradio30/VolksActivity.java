package com.amplitude.tron.volksradio30;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import pl.droidsonroids.gif.GifImageView;

public class VolksActivity extends AppCompatActivity implements Chronometer.OnChronometerTickListener,ImageLoaderTask.Listener {

    Context context;

    //INIT UI CONTROLS
    ImageButton volksPlayerButton;
    TextView volksPlayerText,volksRadioLocation,volksRadioName,staticThumbOne,staticThumbTwo;
    LinearLayout volksWarningLayout,volksPlayerTimer;
    GifImageView volksBufferLoader;
    LinearLayout popup_layout_button;
    Chronometer volksChronometer;
    ImageView volksRadioArt;
    long time;
    long timeWhenStopped=0;
    CountDownTimer cTimer = null;

    //UI UPDATE MONITOR
    static Handler handler;
    Timer timer ;
    static Handler handler2;
    Timer timer2 ;
    TimerTask taskOne,taskTwo;

    //FRAGMENT
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    //GET NOW STREAMING DATA
    private ArrayList<String> radioData;

    //FLIPPER VARS
    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = false;
    private View mCardFrontLayout;
    private View mCardBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volks);

        context=getApplicationContext();

        volksRadioArt=(ImageView) findViewById(R.id.radio_art_view);
        volksPlayerButton=(ImageButton) findViewById(R.id.playerControlButton);
        volksPlayerText=(TextView) findViewById(R.id.playerStatusText);
        volksRadioLocation=(TextView) findViewById(R.id.radio_location_text);
        volksRadioName=(TextView) findViewById(R.id.radio_name_text);
        staticThumbOne=(TextView) findViewById(R.id.thumbnail_static_text1);
        staticThumbTwo=(TextView) findViewById(R.id.thumbnail_static_text2);
        volksWarningLayout=(LinearLayout) findViewById(R.id.warning_layout);
        volksPlayerTimer=(LinearLayout) findViewById(R.id.player_timer);
        volksBufferLoader=(GifImageView) findViewById(R.id.buffer_loader);
        volksChronometer =(Chronometer) findViewById(R.id.chronometer);
        volksChronometer.setOnChronometerTickListener(this);

        //BETA TEST 919 922017
        VolksSysSharedPrefs.setIsBufferingStatus(this.getApplicationContext(),false);
        VolksSysSharedPrefs.setNowStreamingStatus(this.getApplicationContext(),false);

        recurringUIAsyncTask();
        recurringInternetAsyncTask();
        updateVolksConstantsAndUI();

        volksPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VolksActivity.this,VolksPlayerService.class);

                if(VolksMediaConstant.getIsStreamPlaying())
                {
                    intent.setAction("com.amplitude.tron.volksradio30.STOP");
                    startService(intent);
                    timeWhenStopped=0;
                    volksChronometer.setBase(SystemClock.elapsedRealtime());
                    volksChronometer.start();
                }
                else
                {
                    intent.setAction("com.amplitude.tron.volksradio30.PLAY");
                    startService(intent);
                    volksChronometer.setBase(SystemClock.elapsedRealtime());
                    timeWhenStopped=0;
                    volksChronometer.stop();
                }
            }
        });

        popup_layout_button = (LinearLayout) findViewById (R.id.stream_popup_layout);
        popup_layout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragment = new StreamRadioCatalog();
                transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.menu_container, fragment)
                        .setTransition(transaction.TRANSIT_FRAGMENT_FADE)
                        .show(fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        //FLIPPER ANIMATOR
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 20 seconds
                findViews();
                loadAnimations();
                changeCameraDistance();
                flipCard();
                //KEEP THE DELAYER IN SYNC OR HIGHER THAN ACTUAL TIMER OF ANIMATION DEFINED IN THE integer.xml
                handler.postDelayed(this, 6000);
            }
        }, 5000);  //the time is in milliseconds

    }

    private void displayWarning(){
        Animation shake = AnimationUtils.loadAnimation(VolksActivity.this,R.anim.shake);
        findViewById(R.id.warning_layout).startAnimation(shake);
    }

    private void recurringUIAsyncTask() {

        handler = new Handler(Looper.getMainLooper());
        timer = new Timer();

        taskOne = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        try {

                            if (PlayerUIConstant.getIsUIErrorState())
                            {
                                volksPlayerText.setText("Push Play");
                                PlayerUIConstant.setIsUIErrorState(false);
                                volksChronometer.stop();
                                volksChronometer.setBase(SystemClock.elapsedRealtime());
                                timeWhenStopped=0;
                                volksPlayerTimer.setVisibility(View.INVISIBLE);
                            }

                            if (VolksConnectionConstant.getIsConnectionActive())
                            {
                                if (!PlayerUIConstant.getIsUIConnectedState()) {
                                    volksWarningLayout.setVisibility(View.INVISIBLE);
                                    PlayerUIConstant.setIsUIConnectedState(true);
                                }
                                volksWarningLayout.setVisibility(View.INVISIBLE);
                            }
                            else
                            {
                                if (PlayerUIConstant.getIsUIConnectedState()) {
                                    volksWarningLayout.setVisibility(View.VISIBLE);
                                    PlayerUIConstant.setIsUIConnectedState(false);
                                    displayWarning();
                                    volksPlayerText.setText("Push Play");
                                }
                                //volksWarningLayout.setVisibility(View.VISIBLE);

                            }

                            //SPECIAL BUFFER HANDLE
                            if (VolksMediaConstant.getIsStreamBuffering())
                            {
                                if (!PlayerUIConstant.getIsUIBufferingState())
                                {
                                    volksPlayerButton.setVisibility(View.INVISIBLE);
                                    volksBufferLoader.setVisibility(View.VISIBLE);
                                    volksPlayerText.setText("Buffering");
                                    PlayerUIConstant.setIsUIBufferingState(true);
                                    volksChronometer.stop();
                                    timeWhenStopped = volksChronometer.getBase() - SystemClock.elapsedRealtime();
                                    bufferStateGuardian();
                                }
                            }
                            else
                            {
                                if (PlayerUIConstant.getIsUIBufferingState()) {
                                    volksPlayerButton.setVisibility(View.VISIBLE);
                                    volksBufferLoader.setVisibility(View.INVISIBLE);
                                    PlayerUIConstant.setIsUIBufferingState(false);
                                    volksPlayerTimer.setVisibility(View.VISIBLE);
                                    volksChronometer.setBase(SystemClock.elapsedRealtime()+timeWhenStopped);
                                    volksChronometer.start();
                                    //volksPlayerText.setText("Playing Stream");
                                    killBufferStateGuardian();
                                }
                            }

                            if (VolksMediaConstant.getIsStreamPlaying())
                            {
                                if (!PlayerUIConstant.getIsUIPlayingState()) {
                                    volksPlayerText.setText("Playing Stream");
                                    volksPlayerButton.setImageResource(R.mipmap.volks_stop_icon);
                                    PlayerUIConstant.setIsUIPlayingState(true);
                                    volksChronometer.setBase(SystemClock.elapsedRealtime()+timeWhenStopped);
                                    volksChronometer.start();
                                }
                            }
                            else
                            {
                                if (PlayerUIConstant.getIsUIPlayingState()) {
                                    volksPlayerText.setText("Push Play");
                                    volksPlayerButton.setImageResource(R.mipmap.volks_play_icon);
                                    PlayerUIConstant.setIsUIPlayingState(false);
                                    volksChronometer.setBase(SystemClock.elapsedRealtime());
                                    timeWhenStopped=0;
                                    volksChronometer.stop();
                                    volksPlayerTimer.setVisibility(View.INVISIBLE);
                                }
                            }

                        } catch (Exception e) {
                            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        };

        timer.schedule(taskOne, 0, 100);  // interval of 100ms
    }

    private void recurringInternetAsyncTask() {

        handler2 = new Handler(Looper.getMainLooper());
        timer2 = new Timer();

        taskTwo = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        try {

                            radioData=NowStreamingRadio.getRadioInformation(getApplicationContext());
                            if (radioData.get(0).equals("unavailable"))
                            {
                                volksRadioName.setText("Select a stream");
                                volksRadioLocation.setText("to Play!");
                                staticThumbOne.setVisibility(View.GONE);
                                staticThumbTwo.setVisibility(View.GONE);
                            }
                            else
                            {
                                staticThumbOne.setVisibility(View.VISIBLE);
                                staticThumbTwo.setVisibility(View.VISIBLE);
                                volksRadioName.setText(radioData.get(0));
                                volksRadioLocation.setText(radioData.get(2));
                            }


                            if (VolksMediaConstant.getIsNewPush())
                            {
                                VolksMediaConstant.setIsNewPush(false);
                                volksChronometer.setBase(SystemClock.elapsedRealtime());
                                timeWhenStopped=0;
                                volksRadioArt.setImageResource(R.drawable.no_radio_art);
                                new ImageLoaderTask(VolksActivity.this).execute(radioData.get(4));
                                PlayerUIConstant.setHasFailedImageDownload(false);
                            }

                            if (PlayerUIConstant.getHasFailedImageDownload())
                            {
                                volksRadioArt.setImageResource(R.drawable.no_radio_art);
                                new ImageLoaderTask(VolksActivity.this).execute(radioData.get(4));
                                PlayerUIConstant.setHasFailedImageDownload(false);
                            }

                            new VolksConnectionChecker().execute(context);

                        } catch (Exception e) {
                            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        };

        timer2.schedule(taskTwo, 0, 500);  // interval of 5s
    }

    @Override
    public void onChronometerTick(Chronometer cArg) {
       time = SystemClock.elapsedRealtime() - cArg.getBase();

        int h   = (int)(time /3600000);
        int m = (int)(time - h*3600000)/60000;
        int s= (int)(time - h*3600000- m*60000)/1000 ;
        String hh = h < 10 ? "0"+h: h+"";
        String mm = m < 10 ? "0"+m: m+"";
        String ss = s < 10 ? "0"+s: s+"";
        cArg.setText(hh+":"+mm+":"+ss);
    }

    private boolean isServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    private void updateVolksConstantsAndUI()
    {
        volksRadioArt.setImageResource(R.drawable.no_radio_art);
        radioData=NowStreamingRadio.getRadioInformation(getApplicationContext());
        new ImageLoaderTask(this).execute(radioData.get(4));

        if (VolksSysSharedPrefs.getIsBufferingStatus(getApplicationContext()))
        {
            VolksMediaConstant.setIsStreamBuffering(true);
            volksBufferLoader.setVisibility(View.VISIBLE);
            volksPlayerButton.setVisibility(View.INVISIBLE);
            //volksPlayerText.setText("Buffering");
        }
        else
        {
            volksBufferLoader.setVisibility(View.INVISIBLE);
            volksPlayerButton.setVisibility(View.VISIBLE);
            VolksMediaConstant.setIsStreamBuffering(false);
            if (isServiceRunning(VolksPlayerService.class)&&VolksSysSharedPrefs.getNowStreamingStatus(getApplicationContext())) {
                volksPlayerText.setText("Playing Stream");
                volksPlayerButton.setImageResource(R.mipmap.volks_stop_icon);
                volksPlayerTimer.setVisibility(View.VISIBLE);
            }
            else
            {
                volksPlayerText.setText("Push Play");
                volksPlayerButton.setImageResource(R.mipmap.volks_play_icon);
                VolksMediaConstant.setIsStreamPlaying(false);
                volksPlayerTimer.setVisibility(View.INVISIBLE);
            }
        }
    }
    @Override
    public void onBackPressed () {
        if(getSupportFragmentManager().getBackStackEntryCount()>0){
            //POP BACK STACK TO ENSURE BACKING OUT OF APPLICATION
            getSupportFragmentManager().popBackStack();
            enableLayoutButton();
        }
        else{
            //MOVE TASK TO OS BACKGROUND
            moveTaskToBack(true);
        }
    }

    public void disableLayoutButton()
    {
        popup_layout_button.setEnabled(false);
        volksPlayerButton.setEnabled(false);
    }

    public void enableLayoutButton()
    {
        popup_layout_button.setEnabled(true);
        volksPlayerButton.setEnabled(true);
    }

    @Override
    public void onResume(){
        recurringInternetAsyncTask();
        recurringUIAsyncTask();
        enableLayoutButton();
        super.onResume();
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {

    }

    @Override
    public void onPause(){
        NowStreamingRadio.clearArrayList();
        int count = getSupportFragmentManager().getBackStackEntryCount();
        for(int i = 0; i <= count; ++i) {
            getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
        super.onPause();
    }

    @Override
    public void onStop(){
        //timer.cancel();
        timer2.cancel();
        Runtime.getRuntime().gc();
        super.onStop();
    }

    @Override
    public void onDestroy(){
        if (isServiceRunning(VolksPlayerService.class))
        {
            stopService(new Intent(VolksActivity.this,VolksPlayerService.class));
        }

        if (isServiceRunning(VolksNotificationService.class))
        {
            stopService(new Intent(VolksActivity.this,VolksPlayerService.class));
        }

        String systemVolksData="VRSystemData";
        SharedPreferences settings = context.getSharedPreferences(systemVolksData, Context.MODE_PRIVATE);
        settings.edit().clear().apply();

        NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(888885343);

        super.onDestroy();
    }

    @Override
    public void onImageLoaded(Bitmap bitmap) {
        volksRadioArt.setImageBitmap(bitmap);
    }

    @Override
    public void onError() {
        volksRadioArt.setImageResource(R.drawable.no_radio_art);
        PlayerUIConstant.setHasFailedImageDownload(true);
    }

    //FLIPPER METHODS
    private void changeCameraDistance() {
        int distance = 8000;
        float scale = getResources().getDisplayMetrics().density * distance;
        mCardFrontLayout.setCameraDistance(scale);
        mCardBackLayout.setCameraDistance(scale);
    }

    private void loadAnimations() {
        mSetRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.out_animation);
        mSetLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.in_animation);
    }

    private void findViews() {
        mCardBackLayout = findViewById(R.id.card_back);
        mCardFrontLayout = findViewById(R.id.card_front);
    }

    public void flipCard() {
        if (!mIsBackVisible) {
            mSetRightOut.setTarget(mCardFrontLayout);
            mSetLeftIn.setTarget(mCardBackLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = true;
        } else {
            mSetRightOut.setTarget(mCardBackLayout);
            mSetLeftIn.setTarget(mCardFrontLayout);
            mSetRightOut.start();
            mSetLeftIn.start();
            mIsBackVisible = false;
        }
    }

    //BUFFER GUARDIAN
    void bufferStateGuardian() {
        cTimer = new CountDownTimer(20000, 1000) {
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished>13000){
                    volksPlayerText.setText("Buffering");
                }
                else if (millisUntilFinished<13000){
                    volksPlayerText.setText("Attempting to reconnect");
                }
                else if (millisUntilFinished<5000)
                {
                    volksPlayerText.setText("I m done");
                }
            }
            public void onFinish() {
                volksPlayerText.setText("Life is getting Harder!");
            }
        };
        cTimer.start();
    }

    void killBufferStateGuardian() {
        if(cTimer!=null)
            cTimer.cancel();
        volksPlayerText.setText("Playing Stream");
    }

}
