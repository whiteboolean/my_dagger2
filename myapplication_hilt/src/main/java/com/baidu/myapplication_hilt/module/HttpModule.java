package com.baidu.myapplication_hilt.module;


import com.baidu.myapplication_hilt.obj.HttpObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@InstallIn(ApplicationComponent.class)
@Module
public class HttpModule {

    @Provides
    @Singleton
    public HttpObject provideHttpObject(){
        return new HttpObject();
    }
}
