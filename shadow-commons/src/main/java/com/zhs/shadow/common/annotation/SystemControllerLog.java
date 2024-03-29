package com.zhs.shadow.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解，拦截controller
 * @author Austin
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})// 作用在参数和方法上
@Retention(RetentionPolicy.RUNTIME)// 运行时注解
@Documented// 表明这个注解应该被 javadoc工具记录
public @interface SystemControllerLog {

    /**
     * 描述
     */
    String description() default "";
}