package com.raven.demo.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@Data
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应代码：成功
     */
    private static final int SUCCESS = 0;

    /**
     * 响应代码：失败
     */
    private static final int FAIL = 1;

    /**
     * 响应代码：未登录
     */
    private static final int NO_LOGIN = -1;

    /**
     * 响应代码：没有权限
     */
    private static final int NO_PERMISSION = 2;

    /**
     * 响应消息，一般为错误信息
     */
    private String msg = "success";

    /**
     * 响应代码
     */
    private int code = SUCCESS;

    /**
     * 响应内容，一般为成功后返回的数据
     */
    private T data;

    private ResultBean(){
        super();
    }

    private ResultBean(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 构建成功的返回体
     * @param data 返回的数据
     * @param <T> 返回数据格式
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> ResultBean createSuccessResultBean(T data) {
        return new ResultBean(SUCCESS, data, "success");
    }

    /**
     * 构建失败的返回体
     * @param msg 返回的失败信息
     * @return
     */
    @SuppressWarnings("unchecked")
    public static ResultBean createFailResultBean(String msg) {
        return new ResultBean(FAIL, null, msg);
    }

    /**
     * 构建未登录的返回体
     * @return
     */
    @SuppressWarnings("unchecked")
    public static ResultBean createNoLoginResultBean() {
        return new ResultBean(NO_LOGIN, null, "no login");
    }

    /**
     * 构建没有权限的返回体
     * @return
     */
    @SuppressWarnings("unchecked")
    public static ResultBean createNoPermissionResultBean() {
        return new ResultBean(NO_PERMISSION, null, "no permission");
    }
}
