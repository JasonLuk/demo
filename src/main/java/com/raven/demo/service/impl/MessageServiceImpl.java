package com.raven.demo.service.impl;

import com.raven.demo.dao.MessageDao;
import com.raven.demo.eneity.Message;
import com.raven.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> findAll() {
        return messageDao.getAll();
    }

    @Override
    public Message findById(Long id) {
        return messageDao.getOne(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return messageDao.delete(id) == 1;
    }

    @Override
    public boolean add(Message message) {
        return messageDao.insert(message) == 1;
    }

    @Override
    public boolean modify(Message message) {
        return messageDao.update(message) == 1;
    }
}
