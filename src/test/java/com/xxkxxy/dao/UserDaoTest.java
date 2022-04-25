package com.xxkxxy.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Resource
    private UserExtDao userExtDao;

    @Test
    public void save() {
//        User user = new User();
//
//        UserExt userExt = new UserExt();
//
//        user.setUserName("admin");
//        user.setPassword("password");
//        user.setUserExt(userExt);
//
//        userDao.save(user);
    }

}
