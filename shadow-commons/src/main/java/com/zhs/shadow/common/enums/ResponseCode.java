package com.zhs.shadow.common.enums;

/**
 * 响应状态码,各种业务的异常反馈码
 * @author Austin
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

    ResponseCode(int code, String desc) {
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
