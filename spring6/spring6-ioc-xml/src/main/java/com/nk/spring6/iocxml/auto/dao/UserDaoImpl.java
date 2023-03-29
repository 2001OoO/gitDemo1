package com.nk.spring6.iocxml.auto.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDao方法执行");
    }
}
