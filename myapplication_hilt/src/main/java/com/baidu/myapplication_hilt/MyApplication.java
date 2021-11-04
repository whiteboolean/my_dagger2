package com.baidu.myapplication_hilt;

import android.app.Application;

import com.baidu.myapplication_hilt.annotation.BindOkhttp;
import com.baidu.myapplication_hilt.hilt.IHttpProcessor;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApplication extends Application {

    @Inject
    @BindOkhttp
    IHttpProcessor iHttpProcessor;

    public IHttpProcessor getiHttpProcessor(){
        return  iHttpProcessor;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
