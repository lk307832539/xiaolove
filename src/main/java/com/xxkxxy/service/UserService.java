package com.xxkxxy.service;

import com.xxkxxy.dao.UserDao;
import com.xxkxxy.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public int insert(User pojo){
        return userDao.insert(pojo);
    }

    public int insertList(List< User> pojos){
        return userDao.insertList(pojos);
    }

    public List<User> select(User pojo){
        return userDao.select(pojo);
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

}
