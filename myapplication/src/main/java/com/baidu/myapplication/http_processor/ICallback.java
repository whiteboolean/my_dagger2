package com.baidu.myapplication.http_processor;

public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
