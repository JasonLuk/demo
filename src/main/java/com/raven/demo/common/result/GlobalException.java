package com.raven.demo.common.result;

import lombok.Data;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@Data
public class GlobalException extends Exception {

    private String message;

    public GlobalException(String message) {
        this.message = message;
    }
}
