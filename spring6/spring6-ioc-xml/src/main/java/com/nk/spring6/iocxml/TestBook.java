package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.di.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) applicationContext.getBean("book2");
        System.out.println(book);
    }

}
