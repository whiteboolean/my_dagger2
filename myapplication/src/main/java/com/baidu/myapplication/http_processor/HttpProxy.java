package com.baidu.myapplication.http_processor;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

//

/**
 * 房产代理商
 * proxy
 */
public class HttpProxy implements IHttpProcessor {

    //定义一个业主，真正卖房的人
    private static IHttpProcessor mIHttpProcessor = null;

    //通过一个API来设置哪一个业主卖出自己的房子(由谁来完成网络访问)
    public static void init(IHttpProcessor httpProcessor) {
        mIHttpProcessor = httpProcessor;
    }

    //单例
    private HttpProxy() {
    }

    private static HttpProxy httpProxy;

    public static HttpProxy obtain() {
        if (httpProxy == null) {
            synchronized (HttpProxy.class) {
                if (httpProxy == null) {
                    httpProxy = new HttpProxy();
                }
            }
        }
        return httpProxy;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        String finalUrl = appendParams(url, params);
        mIHttpProcessor.post(url, params, callback);
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback iCallback) {

    }

    public static String appendParams(String url, Map<String, Object> params) {
        if (params == null || params.isEmpty()) {
            return url;
        }
        StringBuilder urlBuilder = new StringBuilder(url);
        if (urlBuilder.indexOf("?") <= 0) {
            urlBuilder.append("?");
        } else {
            if (!urlBuilder.toString().endsWith("?")) {
                urlBuilder.append("&");
            }
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            urlBuilder.append("&" + entry.getKey())
                    .append("=")
                    .append(encode(entry.getValue().toString()));
        }
        return urlBuilder.toString();
    }

    private static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
