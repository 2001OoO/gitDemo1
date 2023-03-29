package com.nk;

import com.nk.bean.AnnotationApplicationContext;
import com.nk.bean.ApplicationContext;
import com.nk.service.UserService;

import java.lang.reflect.InvocationTargetException;

public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.nk");
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
