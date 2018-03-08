package com.raven.demo.common.constant;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
public enum CommonErrorInfoEnum {
    ID_NOT_EXIST(1, "ID不存在"),
    ID_IS_EMPTY(2, "ID不允许为空");

    private int code;

    private String message;

    CommonErrorInfoEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
