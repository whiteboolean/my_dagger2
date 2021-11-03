package com.baidu.myapplication.use1;


import dagger.Module;
import dagger.Provides;

@Module
public class DataBaseModule {

    @Provides
    public DataBaseObject provideDataBaseObject() {
        return new DataBaseObject();
    }
}
