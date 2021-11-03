package com.baidu.myapplication.use1;

import com.baidu.myapplication.MainActivity;

import dagger.Component;

@Component(modules = {HttpModule.class ,DataBaseModule.class})
public interface MyComponent {
    //这里无法使用多台
    void injectMainActivity(MainActivity mainActivity);
}
