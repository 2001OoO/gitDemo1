package com.nk.spring6.iocxml.auto.controller;

import com.nk.spring6.iocxml.auto.service.UserService;
import com.nk.spring6.iocxml.auto.service.UserServiceImpl;

public class UserController {
    public void addUser(){
        System.out.println("controller方法执行");
        UserService userService = new UserServiceImpl();
        userService.addUserService();
    }
}
