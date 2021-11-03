package com.example.component2;

import com.example.component2.object.ObjectForTestSubModule;

import dagger.Module;
import dagger.Provides;

@Module
public class TestSubModule {

    @Provides
    public ObjectForTestSubModule provideObjectForTestSubModule(){
        return  new ObjectForTestSubModule();
    }
}
