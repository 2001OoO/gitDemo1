package com.nk.spring6.config;

import com.nk.spring6.resource.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
//        加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = annotationConfigApplicationContext.getBean(UserController.class);
        userController.add();

    }
}
