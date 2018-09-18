package com.menstrual.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by LK on 9/18/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailUtilTest {

    @Test
    public void sendEmail() {
        EmailUtil.sendEmail("test", new String[]{"307832539@qq.com"}, null, "测试测试", null);
    }

}