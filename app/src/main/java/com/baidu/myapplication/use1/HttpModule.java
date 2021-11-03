package com.baidu.myapplication.use1;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpModule {

    @Provides
    public HttpObject provideHttpObject(){
        return new HttpObject();
    }

}
