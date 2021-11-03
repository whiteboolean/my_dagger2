package com.baidu.myapplication.di2;

import com.baidu.myapplication.scope.UserScope;

import javax.inject.Singleton;

import dagger.Component;

@UserScope
@Component(modules = PresenterModule.class)
public interface PresenterComponent {
    //使用依赖关系
//    void injectMainActivity(MainActivity activity);
    Presenter providePresenter();
}
