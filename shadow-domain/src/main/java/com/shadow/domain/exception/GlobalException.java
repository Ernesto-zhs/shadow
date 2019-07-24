package com.shadow.domain.exception;

public class GlobalException extends Exception{

    private static final long serialVersionUID = -4898391456129363730L;

    /**
     * 错误码
     */
    private int errCode;

    public GlobalException(int errCode) {
        super();
        this.errCode = errCode;
    }

    public GlobalException(String message, int errCode) {
        super(message);
        this.errCode = errCode;
    }

    public GlobalException(String message, Throwable cause, int errCode) {
        super(message, cause);
        this.errCode = errCode;
    }

    public GlobalException(Throwable cause, int errCode) {
        super(cause);
        this.errCode = errCode;
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errCode = errCode;
    }
}
