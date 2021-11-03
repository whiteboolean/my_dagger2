package com.baidu.myapplication.use2;

import com.baidu.myapplication.scope.AppScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@AppScope
@Module
public class DataBaseModule {

    @AppScope
    @Provides
    public DataBaseObject provideDatBaseObject(){
        return new DataBaseObject();
    }

}
