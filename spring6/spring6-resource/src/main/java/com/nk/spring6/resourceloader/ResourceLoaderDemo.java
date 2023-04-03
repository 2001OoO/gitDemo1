package com.nk.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceLoaderDemo {
    @Test
    public void Demo1(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        Resource resource = classPathXmlApplicationContext.getResource("test.txt");
        System.out.println(resource.getFilename());

    }

    @Test
    public void Demo2(){
        ApplicationContext classPathXmlApplicationContext = new FileSystemXmlApplicationContext();
        Resource resource = classPathXmlApplicationContext.getResource("test.txt");
        System.out.println(resource.getFilename());
    }
}
