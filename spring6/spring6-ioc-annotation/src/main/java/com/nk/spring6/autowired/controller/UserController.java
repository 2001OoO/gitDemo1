package com.nk.spring6.autowired.controller;

import com.nk.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
//    1.属性注入,根据类型找到对象，完成注入
//    @Autowired
//    private UserService userService;

//    2.set方法注入
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    3.构造方法注入
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }


//    4.形参上注入
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }


//    5.只有一个有参数构造，无注解
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }


//    6.根据名称进行注入
    @Autowired
    @Qualifier(value = "userServiceImpl2")
    private UserService userService;

    public void add(){
        System.out.println("controller running");
        userService.add();
    }

}
