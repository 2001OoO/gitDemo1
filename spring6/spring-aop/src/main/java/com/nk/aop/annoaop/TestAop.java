package com.nk.aop.annoaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAdd(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Calculator bean = classPathXmlApplicationContext.getBean(Calculator.class);
        bean.add(1,0);
    }


}
