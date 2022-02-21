package com.audiovideoplayer.mediaplayer.myapplicationlanguagechange;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String CHANNEL_ID =  "exampleSERVICE";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotification();
    }
    public  void  createNotification(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,"exampleSERVICE",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager= getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
}
