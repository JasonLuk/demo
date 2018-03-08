package com.raven.demo.service;

import com.raven.demo.eneity.Message;

import java.util.List;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
public interface MessageService {

    List<Message> findAll();

    Message findById(Long id);

    boolean deleteById(Long id);

    boolean add(Message message);

    boolean modify(Message message);
}
