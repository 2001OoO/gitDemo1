package com.nk.spring6.prefix;

import com.nk.spring6.di.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestDemo {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean*.xml");
        Resource resource = applicationContext.getResource("test.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

}
