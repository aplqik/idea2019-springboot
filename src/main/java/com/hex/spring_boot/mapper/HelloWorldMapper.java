package com.hex.spring_boot.mapper;

import com.hex.spring_boot.model.User;

import java.util.List;

public interface HelloWorldMapper {
    /**
     * 查询所有
     * @return
     */
    List<User> listAll();

    /**
     * 返回主键
     * @param user
     * @return
     */
    int insertUser(User user);
}
