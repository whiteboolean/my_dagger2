package com.baidu.myapplication.http_processor;

import java.util.Map;

/**
 * 抽象主题类 Subject
 * 对应真实的房产公司
 */
public interface IHttpProcessor  {

    //有卖房的能力
    //有网络访问的能力
    void post(String url, Map<String,Object> params,ICallback callback);

    void get(String url,Map<String,Object> params, ICallback iCallback);

}
