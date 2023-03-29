package com.nk.spring6.iocxml.auto;

import com.nk.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = (UserController) classPathXmlApplicationContext.getBean("userController");
        userController.addUser();

    }
}
