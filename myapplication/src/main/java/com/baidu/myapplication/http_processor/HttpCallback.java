package com.baidu.myapplication.http_processor;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class HttpCallback<T> implements ICallback{

    @Override
    public void onSuccess(String result) {
        Class<?> clz = analysisClassInfo(this);
        Gson gson = new Gson();
         T obj = (T) gson.fromJson(result,clz);
         onSuccess(obj);
    }

    public abstract void onSuccess(T objResult);

    /**
     * 通过该功能得到输入参数的实际类型
     */
    private Class<?> analysisClassInfo(Object object){
        Type getType = object.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = ((ParameterizedType) getType).getActualTypeArguments();
        return (Class<?>) actualTypeArguments[0];

    }

    @Override
    public void onFailure(String e) {

    }
}
