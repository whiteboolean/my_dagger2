package com.baidu.myapplication_hilt.module;

import com.baidu.myapplication_hilt.impl.AnalyticsServiceImpl;
import com.baidu.myapplication_hilt.interfaces.AnalyticsService;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract  class AnalyticModule {
    @Binds
    public abstract AnalyticsService bindAnalyticsService(AnalyticsServiceImpl analyticsService);

}
