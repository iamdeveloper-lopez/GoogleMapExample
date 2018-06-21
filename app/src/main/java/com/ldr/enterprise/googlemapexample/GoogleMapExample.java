package com.ldr.enterprise.googlemapexample;

import android.app.Application;
import android.content.Context;

public class GoogleMapExample extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = this;
    }
}
