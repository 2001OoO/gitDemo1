package com.nk.spring6.junit.junit5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//1.
@SpringJUnitConfig(locations = "classpath:bean.xml")

//2.
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit5 {
    @Autowired
    private User user;

    @Test
    public void TestUser(){
        System.out.println(user);
        user.run();
    }
}
