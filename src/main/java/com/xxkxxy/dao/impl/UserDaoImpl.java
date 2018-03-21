package com.xxkxxy.dao.impl;

import com.xxkxxy.dao.UserDao;
import com.xxkxxy.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LK on 2018/3/20.
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
