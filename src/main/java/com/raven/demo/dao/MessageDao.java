package com.raven.demo.dao;

import com.raven.demo.eneity.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 陆俊琛
 * @date 2018/02/28
 */
public interface MessageDao {

    @Insert("insert into message(name, description, create_time, last_modify_time) values(#{name}, #{description}, now(), now())")
    int insert(Message message);

    @Update("update message set name = #{name}, description = #{description}, last_modify_time = now() where id = #{id}")
    int update(Message message);

    @Delete("delete ftom message where id = #{id}")
    int delete(Long id);

    @Select("select id, name, description from message")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description")
    })
    List<Message> getAll();

    @Select("select * from message where id = #{id}")
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "createTime", column = "create_time")
    })
    Message getOne(Long id);
}
