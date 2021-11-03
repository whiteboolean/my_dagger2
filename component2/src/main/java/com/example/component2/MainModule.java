package com.example.component2;

import com.example.component2.object.A;
import com.example.component2.object.B;
import com.example.component2.object.ObjectForMainModule;
import com.example.component2.object.User;

import java.lang.annotation.Native;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public ObjectForMainModule provideObjectForMainModule(){
        return new ObjectForMainModule();
    }


    @Provides
    public B provideB(){
        return new B();
    }

    @Provides
    public A provideA(B b){
        return new A(b);
    }

    @Named("key1")
    @Provides
    public User provideUser(){
        return new User("张三",13);
    }

    @Named("key2")
    @Provides
    public User provideUser2(){
        return new User("lisi",15);
    }
}
