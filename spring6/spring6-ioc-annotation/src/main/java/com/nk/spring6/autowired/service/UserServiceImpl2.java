package com.nk.spring6.autowired.service;

import com.nk.spring6.autowired.dao.UserDao;
import com.nk.spring6.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("UserServiceImpl2 running");
        userDao.add();

    }
}
