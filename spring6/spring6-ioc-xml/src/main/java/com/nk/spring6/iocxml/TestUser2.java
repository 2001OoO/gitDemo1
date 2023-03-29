package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.life.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("6. bean对象已创建，可以进行使用");
        applicationContext.close();
    }
}
