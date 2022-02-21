package com.audiovideoplayer.mediaplayer.myapplicationlanguagechange;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import static com.audiovideoplayer.mediaplayer.myapplicationlanguagechange.App.CHANNEL_ID;

public class LanguageService  extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
     String hello =intent.getStringExtra("urdu");
     Intent intent1=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent= PendingIntent.getActivity(this,0,intent1,0);
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("Language Change")
                .setContentText(hello)
                .setContentIntent(pendingIntent)
                .build();
        startForeground(1,notification);

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopSelf();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
