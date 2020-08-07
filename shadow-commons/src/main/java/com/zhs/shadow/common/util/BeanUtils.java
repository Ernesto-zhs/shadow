package com.zhs.shadow.common.util;

/**
 * 自己封装的对象工具
 * @author Austin
 */
public class BeanUtils {

    public static void main(String[] args) {

    }

    public static void copyProperties(Object orig, Object target) {
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(target, orig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
