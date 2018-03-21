package com.xxkxxy.service;

import com.xxkxxy.entity.User;

import java.util.List;

/**
 * Created by LK on 2018/3/20.
 */
public abstract interface UserMng {
    List<User> getAllUser();

    User getUserById(Integer id);

    User getUserByUserName(String userName);
}
