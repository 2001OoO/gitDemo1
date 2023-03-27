package com.nk;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject(){
//        加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

//        获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

//        进行获取对象测试
        user.add();

        logger.info("手动写日志success");

    }

    @Test
    public void testUserObject2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.nk.User");

        User o = (User) aClass.getDeclaredConstructor().newInstance();
        System.out.println(o);
    }




}
