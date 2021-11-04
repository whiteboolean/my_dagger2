package com.baidu.myapplication_hilt.hilt;

/**
 * 顶层的回调接口   string---->json,xml,protobuff
 */
public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
