package com.baidu.myapplication.http_processor;

import java.util.Map;

public class OtherProcessor implements IHttpProcessor{
    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        //.....
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {

    }
}
