package com.nk.spring6.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user);

    }
}
