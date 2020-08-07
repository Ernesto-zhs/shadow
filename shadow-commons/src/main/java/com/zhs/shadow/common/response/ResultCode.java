package com.zhs.shadow.common.response;

/**
 * 枚举了一些常用API操作码
 *
 * @author Austin
 */
public enum ResultCode implements IErrorCode {

    // 系统相关相应 ?xx
    SUCCESS(200, "操作成功"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    VALIDATE_FAILED(404, "参数检验失败"),
    FAILED(500, "操作失败"),
    ;

    // 业务相关响应 ?xxx


    private long code;

    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
