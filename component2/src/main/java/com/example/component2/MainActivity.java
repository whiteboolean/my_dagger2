package com.example.component2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.component2.object.A;
import com.example.component2.object.B;
import com.example.component2.object.ObjectForMainModule;
import com.example.component2.object.ObjectForTestSubModule;
import com.example.component2.object.User;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    ObjectForMainModule object;

    @Inject
    ObjectForTestSubModule subObj;

    @Inject
    A a;
    @Inject
    B b;

    @Named("key1")
    @Inject
    User user1;

    @Named("key2")
    @Inject
    User user2;

    @Inject
    Lazy<A> aLazy; //这种是单例

    @Inject
    Provider<A> provider; //这种是非单例

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.create().getTestSubsComponent().injectMyActivity(this);

        Log.e(TAG,"object:"+object.hashCode()+"");
        Log.e(TAG,"subObj:"+subObj.hashCode()+"");
        Log.e(TAG,"a:"+a.hashCode()+"");
        Log.e(TAG,"b:"+b.hashCode()+"");
        Log.e(TAG,"user1:"+user1.hashCode()+"");
        Log.e(TAG,"user2:"+user2.hashCode()+"");
        Log.e(TAG,"aLazy1:"+aLazy.get().hashCode()+"");
        Log.e(TAG,"aLazy2:"+aLazy.get().hashCode()+"");
        Log.e(TAG,"provider1:"+provider.get().hashCode()+"");
        Log.e(TAG,"provider2:"+provider.get().hashCode()+"");

    }
}