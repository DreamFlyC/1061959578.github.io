package cn.dsq4.web1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 段市庆
 * @date: 2021/6/20 21:57
 */
/*
    注解用法
*/

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test474Pro {
    String className();
    String methodName();
}
