package com.hex.spring_boot.controller;

import com.hex.spring_boot.model.User;
import com.hex.spring_boot.service.HelloWorldService;
import com.hex.spring_boot.service.impl.HelloWorldServiceImpl;
import com.hex.spring_boot.service.impl.HelloWorldServieImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    private HelloWorldService helloWorldService;

    @RequestMapping("/world")
    public String doHello(Model model) {
        model.addAttribute("hello", "你好世界");
        return "hi";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(Model model) {
        List<User> userList = helloWorldService.listAll();
        return userList;
    }
}
