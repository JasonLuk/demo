package com.raven.demo.eneity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String description;

    private Date createTime;

    private Date lastModifyTime;
}
