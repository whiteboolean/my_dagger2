package com.baidu.myapplication.use1;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpModule1 {

    @Provides
    public HttpObject1 provideHttpObject(){
        return new HttpObject1();
    }

}
