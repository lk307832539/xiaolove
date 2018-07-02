package com.xxkxxy.dao;

import com.xxkxxy.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User();
        user.setUserName("admin");
        user.setPassword("password");
        userDao.save(user);
    }

    @Test
    public void findByUserId() {

    }
}