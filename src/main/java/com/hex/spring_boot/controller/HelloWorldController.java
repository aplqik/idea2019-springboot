package com.hex.spring_boot.controller;

import com.hex.spring_boot.mapper.HelloWorldMapper;
import com.hex.spring_boot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
    @Resource
    private HelloWorldMapper helloWorldMapper;

    @RequestMapping("/world")
    public String doHello(Model model){
        model.addAttribute("hello","你好世界");
        return "hi";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(Model model){
        List<User> userList =helloWorldMapper.listAll();
        return userList;
    }
}
