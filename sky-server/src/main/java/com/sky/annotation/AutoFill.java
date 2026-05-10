package com.sky.annotation;
// 自动填充注解

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 指定注解的位置在方法上
@Target(ElementType.METHOD)
// 指定注解的保留策略
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value();

}
