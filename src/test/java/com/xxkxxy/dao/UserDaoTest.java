package com.xxkxxy.dao;

import com.xxkxxy.entity.User;
import com.xxkxxy.entity.UserExt;
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
    @Resource
    private UserExtDao userExtDao;

    @Test
    public void save() {
        User user = new User();

        UserExt userExt = new UserExt();

        user.setUserName("admin");
        user.setPassword("password");
        user.setUserExt(userExt);

        userDao.save(user);
    }

}