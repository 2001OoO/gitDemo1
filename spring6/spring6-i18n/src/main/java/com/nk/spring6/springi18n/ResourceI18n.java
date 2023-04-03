package com.nk.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Object[] objects = new Object[]{"hello", new Date().toLocaleString()};
        String username = applicationContext.getMessage("username", objects, Locale.CHINA);
        String key = applicationContext.getMessage("key", objects, Locale.CHINA);
        System.out.println(username);
        System.out.println(key);
    }
}
