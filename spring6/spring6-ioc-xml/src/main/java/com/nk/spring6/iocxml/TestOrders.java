package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.scope.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = (Orders) applicationContext.getBean("orders2");
        System.out.println(orders);
        Orders orders2 = (Orders) applicationContext.getBean("orders2");
        System.out.println(orders2);
    }


}
