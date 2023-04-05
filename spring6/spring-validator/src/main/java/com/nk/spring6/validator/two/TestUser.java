package com.nk.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

    @Test
    public void testValidationOne(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 bean = annotationConfigApplicationContext.getBean(MyValidation1.class);

        User user = new User();
        user.setName("小花狗");
        user.setAge(20);
        boolean b = bean.validatorByUser(user);
        System.out.println(b);
    }


    @Test
    public void testValidationTwo(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 bean = annotationConfigApplicationContext.getBean(MyValidation2.class);

        User user = new User();
        user.setName("小花狗");
        user.setAge(-1);
        boolean b = bean.validatorByUserTwo(user);
        System.out.println(b);
    }

}
