package com.zhs.shadow.admin.annotation;

import java.lang.annotation.*;

/**
 * Title: SystemControllerLog
 * @author Austin
 * Description:  自定义注解，拦截controller
 * @version V1.0
 * @date 2018年8月31日
 */

@Target({ElementType.PARAMETER, ElementType.METHOD})//作用在参数和方法上
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Documented//表明这个注解应该被 javadoc工具记录
public @interface SystemControllerLog {

    /**
     * 描述
     * @return
     */
    String description() default "";
}