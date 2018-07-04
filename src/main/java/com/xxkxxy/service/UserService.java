package com.xxkxxy.service;

import com.xxkxxy.dao.UserDao;
import com.xxkxxy.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User findByUserName(String userName) {
       return userDao.findByUserName(userName);
    }

    public User save(User user) {
        return userDao.save(user);
    }

}
