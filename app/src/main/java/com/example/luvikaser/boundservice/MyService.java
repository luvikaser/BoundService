package com.example.luvikaser.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class MyService extends Service {

    private final IBinder mIBinder = new LocalBinder();
    private final Random mGenerator = new Random();
    public class LocalBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mIBinder;
    }

    /** method for clients */
    public int GetRandomNumber(){
        return mGenerator.nextInt(100);
    }
}
