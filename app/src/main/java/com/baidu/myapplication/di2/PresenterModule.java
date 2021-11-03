package com.baidu.myapplication.di2;

import com.baidu.myapplication.scope.UserScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@UserScope
@Module
public class PresenterModule {

    @UserScope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
