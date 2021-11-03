package com.baidu.myapplication.use2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class HttpModule {

    @Singleton
    @Provides
    public HttpObject provideHttpObject(){
        return new HttpObject();
    }
}
