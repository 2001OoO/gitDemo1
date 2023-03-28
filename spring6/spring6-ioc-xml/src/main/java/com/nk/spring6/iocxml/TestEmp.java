package com.nk.spring6.iocxml;

import com.nk.spring6.iocxml.ditest.Dept;
import com.nk.spring6.iocxml.ditest.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-ditlist.xml");

//        Emp emp = (Emp) applicationContext.getBean("emp");
//        emp.work();
        Dept dept = (Dept) applicationContext.getBean("dept");
        dept.info();


    }

}
