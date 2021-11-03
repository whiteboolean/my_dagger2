package com.baidu.myapplication.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope //作用域
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}
