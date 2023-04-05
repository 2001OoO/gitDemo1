package com.nk.spring6.validator.three;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService bean = annotationConfigApplicationContext.getBean(MyService.class);

        User user = new User();
        user.setName("沟北");
        user.setPhone("13199945600");
        user.setMessage(" ");
        bean.testMethod(user);
    }
}
