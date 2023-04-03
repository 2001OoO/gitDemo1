package com.nk.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = (ResourceBean) applicationContext.getBean("resourceBean");
        resourceBean.parse();
    }
}
