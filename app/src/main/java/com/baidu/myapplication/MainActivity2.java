package com.baidu.myapplication;

import android.os.Bundle;

import com.baidu.myapplication.app.MyApplication;
import com.baidu.myapplication.di.Presenter;
import com.baidu.myapplication.use2.HttpObject;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    @Inject
    HttpObject httpObject;


    @Inject
    Presenter presenter;

    @Inject
    Presenter presenter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ((MyApplication) getApplication()).getMyComponent().injectMainActivity2(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        Log.e(TAG,httpObject.hashCode()+"");
        Log.e(TAG,"presenter:"+presenter.hashCode()+"");
        Log.e(TAG,"presenter1:"+presenter1.hashCode()+"");
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}