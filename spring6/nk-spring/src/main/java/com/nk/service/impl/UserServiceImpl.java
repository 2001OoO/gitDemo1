package com.nk.service.impl;

import com.nk.anno.Bean;
import com.nk.anno.Di;
import com.nk.dao.UserDao;
import com.nk.service.UserService;

@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service running");
        userDao.add();
    }
}
