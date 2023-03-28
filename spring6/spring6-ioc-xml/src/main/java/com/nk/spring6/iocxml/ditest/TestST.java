package com.nk.spring6.iocxml.ditest;

import com.nk.spring6.iocxml.dimap.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestST {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.run();
    }
}
