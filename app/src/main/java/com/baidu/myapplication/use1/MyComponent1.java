package com.baidu.myapplication.use1;

import com.baidu.myapplication.MainActivity;
import com.baidu.myapplication.MainActivity2;

import dagger.Component;

@Component(modules = {HttpModule1.class , DataBaseModule1.class})
public interface MyComponent1 {
    //这里无法使用多台
//    void injectMainActivity(MainActivity2 mainActivity);
}
