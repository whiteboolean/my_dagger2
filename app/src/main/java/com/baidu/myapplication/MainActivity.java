package com.baidu.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.myapplication.use1.DaggerMyComponent;
import com.baidu.myapplication.use1.DataBaseModule;
import com.baidu.myapplication.use1.DataBaseObject;
import com.baidu.myapplication.use1.HttpModule;
import com.baidu.myapplication.use1.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Inject
    DataBaseObject dataBaseObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMyComponent.create().injectMainActivity(this);
//        DaggerMyComponent.
//                builder().
//                httpModule(new HttpModule())
//                .dataBaseModule(new DataBaseModule())
//                .build().injectMainActivity(this);




        Log.e(TAG, httpObject.hashCode() + "");
        Log.e(TAG, httpObject2.hashCode() + "");
        Log.e(TAG,dataBaseObject.hashCode()+"");

    }
}