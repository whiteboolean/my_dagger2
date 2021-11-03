package com.baidu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.myapplication.use2.HttpObject;


import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getMyComponent().injectMainActivity(this);
        Log.e(TAG, httpObject.hashCode() + "");
        Log.e(TAG, httpObject1.hashCode() + "");

    }

    public void click(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }
}