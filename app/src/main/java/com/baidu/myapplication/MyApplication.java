package com.baidu.myapplication;

import android.app.Application;

import com.baidu.myapplication.use2.DaggerMyComponent;
import com.baidu.myapplication.use2.DataBaseModule;
import com.baidu.myapplication.use2.HttpModule;
import com.baidu.myapplication.use2.MyComponent;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .dataBaseModule(new DataBaseModule())
                .build();

    }


    public MyComponent getMyComponent(){
        return myComponent;
    }
}
