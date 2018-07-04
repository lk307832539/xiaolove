package com.xxkxxy.dao;

import com.xxkxxy.entity.Content;
import com.xxkxxy.entity.ContentExt;
import com.xxkxxy.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContentDaoTest {
    @Resource
    private ContentDao contentDao;
    @Resource
    private UserDao userDao;

    @Test
    public void save() {

        User user = userDao.getOne(1);

        Content content = new Content();
        ContentExt contentExt = new ContentExt();

        content.setUser(user);
        content.setCreateDate(new Timestamp(System.currentTimeMillis()));
        content.setContentExt(contentExt);

        contentExt.setContent(content);

        contentDao.save(content);
    }
}