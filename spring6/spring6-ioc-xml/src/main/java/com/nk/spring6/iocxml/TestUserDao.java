package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        UserDao bean = applicationContext.getBean("userDaoImpl2",UserDao.class);

        System.out.println(bean);
        bean.run();
    }
}
