package com.nk.spring6.resource.service;


import com.nk.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {

//    根据属性名进行注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("UserService running");
        myUserDao.add();
    }
}
