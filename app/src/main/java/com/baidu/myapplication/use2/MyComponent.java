package com.baidu.myapplication.use2;

import android.app.Application;

import com.baidu.myapplication.MainActivity;
import com.baidu.myapplication.MainActivity2;
import com.baidu.myapplication.MyApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {HttpModule.class,DataBaseModule.class})
public interface MyComponent {
    //注入
//    void injectMainActivity(MainActivity mainActivity);
//
//    void injectMainActivity2(MainActivity2 mainActivity2);
}
