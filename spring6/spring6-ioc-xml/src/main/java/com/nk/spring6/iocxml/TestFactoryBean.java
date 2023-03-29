package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.factorybean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User myFactoryBean = (User) classPathXmlApplicationContext.getBean("myFactoryBean");
        System.out.println(myFactoryBean);
    }
}
