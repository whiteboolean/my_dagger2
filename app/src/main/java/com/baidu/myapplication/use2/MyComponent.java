package com.baidu.myapplication.use2;

import com.baidu.myapplication.MainActivity;
import com.baidu.myapplication.MainActivity2;
import com.baidu.myapplication.di.PresenterComponent;
import com.baidu.myapplication.scope.AppScope;

import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Component(modules = {HttpModule.class,DataBaseModule.class},dependencies = PresenterComponent.class)
public interface MyComponent {
    //注入
    void injectMainActivity(MainActivity mainActivity);
//
    void injectMainActivity2(MainActivity2 mainActivity2);
}
