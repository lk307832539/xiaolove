package com.xxkxxy.service;

import com.xxkxxy.dao.ContentExtDao;
import com.xxkxxy.entity.ContentExt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LK on 2017/5/29.
 */
@Service
@Transactional
public class ContentExtService {
    private ContentExtDao contentExtDao;

    public ContentExt save(ContentExt contentExt) {
        return contentExtDao.save(contentExt);
    }
}
