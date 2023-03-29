package com.nk.spring6.resource;

import com.nk.spring6.resource.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = classPathXmlApplicationContext.getBean(UserController.class);

        userController.add();

    }
}
