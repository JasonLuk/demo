package com.raven.demo.common.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalException.class)
    public ResultBean errorHandlerOverJson(HttpServletRequest request,
                                           GlobalException exception) {
        request.getRequestURL();
        return ResultBean.createFailResultBean(exception.getMessage());
    }
}
