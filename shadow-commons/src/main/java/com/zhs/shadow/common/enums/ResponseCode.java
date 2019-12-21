package com.zhs.shadow.common.enums;

/**
 * 作者 Austin
 * 时间 2019-07-11 22:59
 * 响应状态码,各种业务的异常反馈码
 */
public enum ResponseCode {


    ;

    /**
     * 响应码
     */
    private int code;

    /**
     * 描述
     */
    private String desc;

    private ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
