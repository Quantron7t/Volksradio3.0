package com.amplitude.tron.volksradio30;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.NotificationCompat;
import android.widget.RemoteViews;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Tron on 1/28/2017.
 */

public class VolksNotificationService extends Service{

    ArrayList<String> ar;

    //NOTIFICATION RELATED CLASSES
    private NotificationCompat.Builder builder;
    private NotificationManager notificationManager;
    private RemoteViews remoteViews;
    private Context context;
    Intent notification_intent;

    final int notification_id =888885343;

    private static final String CHANGE_ON_PLAY = "com.amplitude.tron.volksradio30.PLAYING";
    private static final String CHANGE_ON_STOP = "com.amplitude.tron.volksradio30.STOPPED";
    private static final String CHANGE_ON_BUFFER = "com.amplitude.tron.volksradio30.BUFFERING";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent.getAction().equals(CHANGE_ON_PLAY)) {
            onPlayUpdateNotification();
        }
        else if(intent.getAction().equals(CHANGE_ON_STOP)){
            onStopUpdateNotification();
        }
        else if(intent.getAction().equals(CHANGE_ON_BUFFER)){
            onBufferUpdateNotification();
        }

        return START_NOT_STICKY;
    }

    private void onPlayUpdateNotification()
    {
        ar=new ArrayList<>(NowStreamingRadio.getRadioInformation(getApplicationContext()));
        //ar.addAll(NowStreamingRadio.getRadioInformation(getApplicationContext()));
        context = getApplicationContext();
        notification_intent = new Intent(context,VolksActivity.class);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        remoteViews = new RemoteViews(context.getPackageName(),R.layout.n_layout);

        //String drawable="R.drawable."+ar.get(3);
        remoteViews.setImageViewResource(R.id.n_image_view,getId(ar.get(3),R.mipmap.class));
        remoteViews.setTextViewText(R.id.n_title,"Now Streaming");
        remoteViews.setTextViewText(R.id.n_station_name,ar.get(0));
        remoteViews.setImageViewResource(R.id.n_button,R.mipmap.volks_notification_stop_icon);

        Intent button_intent = new Intent("player_ignite");
        button_intent.putExtra("id",notification_id);

        PendingIntent controller_intent=PendingIntent.getBroadcast(context,0,button_intent,0);
        remoteViews.setOnClickPendingIntent(R.id.n_button,controller_intent);

        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,notification_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        builder = new NotificationCompat.Builder(context);

        builder.setSmallIcon(R.mipmap.ic_volks_radio_logo)
                .setCustomContentView(remoteViews)
                .setContentIntent(pendingIntent)
                .setColor(ContextCompat.getColor(context, R.color.notification_background_dark))
                .setOngoing(true)
                .setPriority(Notification.PRIORITY_MAX);

        notificationManager.notify(notification_id,builder.build());
    }

    private void onStopUpdateNotification()
    {
        ar=new ArrayList<>(NowStreamingRadio.getRadioInformation(getApplicationContext()));

        context = getApplicationContext();
        notification_intent = new Intent(context,VolksActivity.class);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        remoteViews = new RemoteViews(context.getPackageName(),R.layout.n_layout);

        remoteViews.setImageViewResource(R.id.n_image_view,getId(ar.get(3),R.mipmap.class));
        remoteViews.setTextViewText(R.id.n_title,"Stopped");
        remoteViews.setTextViewText(R.id.n_station_name,ar.get(0));
        remoteViews.setImageViewResource(R.id.n_button,R.mipmap.volks_notification_play_icon);

        Intent button_intent= new Intent("player_ignite");
        button_intent.putExtra("id",notification_id);

        PendingIntent controller_intent=PendingIntent.getBroadcast(context,0,button_intent,0);
        remoteViews.setOnClickPendingIntent(R.id.n_button,controller_intent);

        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,notification_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        builder =new NotificationCompat.Builder(context);

        builder.setSmallIcon(R.mipmap.ic_volks_radio_logo)
                .setCustomContentView(remoteViews)
                .setContentIntent(pendingIntent)
                .setColor(ContextCompat.getColor(context, R.color.notification_background_dark))
                .setOngoing(false)
                .setPriority(Notification.PRIORITY_LOW);

        notificationManager.notify(notification_id,builder.build());
    }

    private void onBufferUpdateNotification()
    {
        ar=new ArrayList<>(NowStreamingRadio.getRadioInformation(getApplicationContext()));

        context = getApplicationContext();
        notification_intent = new Intent(context,VolksActivity.class);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        remoteViews = new RemoteViews(context.getPackageName(),R.layout.n_layout_buffer);

        remoteViews.setImageViewResource(R.id.n_image_view,getId(ar.get(3),R.mipmap.class));
        remoteViews.setTextViewText(R.id.n_title,"Buffering");
        remoteViews.setTextViewText(R.id.n_station_name,ar.get(0));

        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,notification_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        builder = new NotificationCompat.Builder(context);

        builder.setSmallIcon(R.mipmap.ic_volks_radio_logo)
                .setCustomContentView(remoteViews)
                .setContentIntent(pendingIntent)
                .setColor(ContextCompat.getColor(context, R.color.notification_background_dark))
                .setOngoing(true)
                .setPriority(Notification.PRIORITY_MAX);

        builder.mActions.clear();

        notificationManager.notify(notification_id,builder.build());
    }

    public static int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            throw new RuntimeException("No resource ID found for: "
                    + resourceName + " / " + c, e);
        }
    }
}
