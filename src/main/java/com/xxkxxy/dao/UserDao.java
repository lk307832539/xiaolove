package com.xxkxxy.dao;

import com.xxkxxy.entity.User;

import java.util.List;

/**
 * Created by LK on 2018/3/20.
 */
public abstract interface UserDao {
    List<User> getAllUser();

    User getUserById(Integer id);

    User getUserByUserName(String userName);

    void addUser(User user);
}
