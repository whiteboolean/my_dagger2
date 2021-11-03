package com.baidu.myapplication.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class PresenterModule {

    @Singleton
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
