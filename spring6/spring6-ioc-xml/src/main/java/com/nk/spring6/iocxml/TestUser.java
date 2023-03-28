package com.nk.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

//    根据id获取bean
        User user = (User) applicationContext.getBean("user");
        System.out.println("根据id获取bean："+user);

//        根据类型获取bean
//        User user2 = (User) applicationContext.getBean(User.class);
//        System.out.println("根据类型获取bean："+user2);

//        根据id和类型获取bean
        User user3 = applicationContext.getBean("user1", User.class);
        System.out.println("根据id和类型bean："+user3);

    }

}
