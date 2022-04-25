package com.xxkxxy.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ContentDaoTest {
    @Resource
    private ContentDao contentDao;
    @Resource
    private UserDao userDao;

    @Test
    public void save() {
//
//        User user = userDao.getOne(1);
//
//        Content content = new Content();
//        ContentExt contentExt = new ContentExt();
//
//        content.setUser(user);
//        content.setCreateDate(new Timestamp(System.currentTimeMillis()));
//        content.setContentExt(contentExt);
//
//        contentExt.setContent(content);
//
//        contentDao.save(content);
    }
}
