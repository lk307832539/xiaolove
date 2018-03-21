package com.xxkxxy.dao.impl;

import com.xxkxxy.dao.UserDao;
import com.xxkxxy.entity.User;
import com.xxkxxy.entity.base.BaseUser;
import com.xxkxxy.mapper.UserMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2018/3/20.
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Resource
    private UserMapper userMapper;

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
