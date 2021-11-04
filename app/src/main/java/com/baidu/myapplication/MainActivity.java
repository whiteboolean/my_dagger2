package com.baidu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.myapplication.app.MyApplication;
import com.baidu.myapplication.use2.DataBaseObject;
import com.baidu.myapplication.use2.HttpObject;


import javax.inject.Inject;


/**
 * dagger2不允许两个以及两个以上component注入到一个Activity中
 *
 * Scope与dependencies的使用：
 * 1.多个component上面的Scope不能相同
 * 2.没有scope的组件不能去依赖有scope的组件
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Inject
    HttpObject httpObject;

    @Inject
    DataBaseObject object;

    @Inject
    HttpObject httpObject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getMyComponent().injectMainActivity(this);
        Log.e(TAG, httpObject.hashCode() + "");
        Log.e(TAG, httpObject1.hashCode() + "");
        Log.e(TAG,"databaseobj:"+object.hashCode());

    }

    public void click(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }


}