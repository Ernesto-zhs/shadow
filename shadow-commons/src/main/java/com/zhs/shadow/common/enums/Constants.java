package com.zhs.shadow.common.enums;

/**
 * 常量接口 用于保存各种系统常量值的定义
 * @author Austin
 */
public interface Constants {

    /**
     * 本地IPv4地址
     */
    String LOCAL_IPV4_ADDRESS = "127.0.0.1";

    /**
     * 本地localhost地址
     */
    String LOCALHOST_ADDRESS = "0:0:0:0:0:0:0:1";

    /**
     * 数据删除状态
     */
    interface DeleteState {

        /**
         * 启用
         */
        short NORMAL = 0;

        /**
         * 删除
         */
        short DELETE = 1;

    }

    /**
     * 城市状态
     */
    interface CityState {
        /**
         * 启用
         */
        int ENABLE = 0;
        /**
         * 禁用
         */
        int DISABLE = 1;
    }

}
