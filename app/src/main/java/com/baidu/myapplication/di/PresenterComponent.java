package com.baidu.myapplication.di;

import com.baidu.myapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = PresenterModule.class)
public interface PresenterComponent {
    //使用依赖关系
//    void injectMainActivity(MainActivity activity);
    Presenter providePresenter();
}
