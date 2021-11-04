package com.baidu.myapplication.http_processor;

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpProxy.init(new OkHttpProcessor());
    }
}
