package com.nk.tx;

import com.nk.config.SpringConfig;
import com.nk.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    @Test
    public void Test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController = (BookController) annotationConfigApplicationContext.getBean("bookController");
        bookController.checkoutBook(new Integer[]{1,1,1,2},1);

    }
}
