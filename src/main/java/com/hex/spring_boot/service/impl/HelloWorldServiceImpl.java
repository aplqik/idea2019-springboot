package com.hex.spring_boot.service.impl;

import com.hex.spring_boot.mapper.HelloWorldMapper;
import com.hex.spring_boot.model.User;
import com.hex.spring_boot.service.HelloWorldService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.naming.Name;
import java.util.List;
@Service(value = "helloService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Resource
    private HelloWorldMapper helloWorldMapper;
    @Transactional
    public List<User> listAll() {
        User user = new User();
        user.setNickName("你好");
        user.setPassWord("11111");
        int id = helloWorldMapper.insertUser(user);
        System.out.println(user.getId());
        //int i  = 1/0;
        return helloWorldMapper.listAll();
    }
}
