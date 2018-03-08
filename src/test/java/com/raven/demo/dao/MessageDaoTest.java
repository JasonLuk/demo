package com.raven.demo.dao;

import com.raven.demo.eneity.Message;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
public class MessageDaoTest {

    @Autowired
    private MessageDao messageDao;

    @Test
    @Ignore
    public void insert() {
        Message message = new Message();
        message.setName("TEST");
        message.setDescription("尝试");
        assertEquals(1, messageDao.insert(message));
    }

    @Test
    @Ignore
    public void update() {
    }

    @Test
    @Ignore
    public void delete() {
    }

    @Test
    @Ignore
    public void getAll() {
    }

    @Test
    public void getOne() {
        System.out.println(messageDao == null);
        Message message = messageDao.getOne(1L);
        System.out.println(message == null);
        System.out.println(message.getName());

        assertEquals("test", messageDao.getOne(1L).getName());
    }
}