package com.nk.spring6.resourceloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = (TestBean) classPathXmlApplicationContext.getBean("testBean");
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println(classPathXmlApplicationContext == resourceLoader);
    }
}
