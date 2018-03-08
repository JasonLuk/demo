package com.raven.demo.controller;

import com.raven.demo.common.result.ResultBean;
import com.raven.demo.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@Api(description = "Message相关接口")
@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @ApiOperation(value = "获得所有message", notes = "获得所有message", httpMethod = "POST")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ResultBean getAll() {
        return ResultBean.createSuccessResultBean(messageService.findAll());
    }
}
