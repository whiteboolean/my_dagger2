package com.baidu.myapplication.use1;


import dagger.Module;
import dagger.Provides;

@Module
public class DataBaseModule1 {

    @Provides
    public DataBaseObject1 provideDataBaseObject() {
        return new DataBaseObject1();
    }
}
