package com.baidu.myapplication.use2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class DataBaseModule {

    @Singleton
    @Provides
    public DataBaseObject provideDatBaseObject(){
        return new DataBaseObject();
    }

}
