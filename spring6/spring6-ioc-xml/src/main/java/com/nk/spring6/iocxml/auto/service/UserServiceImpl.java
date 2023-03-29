package com.nk.spring6.iocxml.auto.service;

import com.nk.spring6.iocxml.auto.dao.UserDao;
import com.nk.spring6.iocxml.auto.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService执行");
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUser();

        userDao.addUser();
    }
}
