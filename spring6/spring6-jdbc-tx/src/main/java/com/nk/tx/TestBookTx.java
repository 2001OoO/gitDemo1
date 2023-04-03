package com.nk.tx;

import com.nk.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestBookTx {
    @Autowired
    private BookController bookController;

    @Test
    public void Test1(){
        bookController.buyBook(2,1);
    }


    @Test
    public void Test2(){
        bookController.checkoutBook(new Integer[]{1,1,1,1,2},1);
    }
}
