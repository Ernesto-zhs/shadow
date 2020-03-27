package com.zhs.shadow.common.response;

/**
 * 封装API的错误码
 * @author Austin
 */
public interface IErrorCode {

    /**
     * 得到返回码
     * @return
     */
    long getCode();

    /**
     * 得到信息
     * @return
     */
    String getMessage();
}
