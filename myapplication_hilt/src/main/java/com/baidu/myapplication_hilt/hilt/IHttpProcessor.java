package com.baidu.myapplication_hilt.hilt;

import java.util.Map;

/**
 * 房产公司
 */
public interface IHttpProcessor {
    //网络访问的能力
    void post(String url, Map<String,Object> params, ICallback callback);

    //....
}

