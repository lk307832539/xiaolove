package com.xxkxxy.service;

import com.xxkxxy.dao.ContentDao;
import com.xxkxxy.entity.Content;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
@Service
@Transactional
public class ContentService {

    @Resource
    private ContentDao contentDao;

    public List<Content> findAll() {
        return contentDao.findAll();
    }

    public Content save(Content content) {
        return contentDao.save(content);
    }

    public Content getOne(Integer id) {
        return contentDao.getOne(id);
    }
}
