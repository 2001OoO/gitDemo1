package com.nk.spring6.resource.controller;

import com.nk.spring6.bean.User;
import com.nk.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

//    根据name进行注入
    @Resource(name = "myUserService")
    private UserService userService;

    public void add(){
        System.out.println("controller running");
        userService.add();
    }

}
