package com.limpoxe.demo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class Service2 extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
