package com.nk.dao.Impl;

import com.nk.anno.Bean;
import com.nk.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {


    @Override
    public void add() {
        System.out.println("Dao running");
    }
}
