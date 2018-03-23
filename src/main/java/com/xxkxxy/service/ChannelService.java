package com.xxkxxy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.xxkxxy.entity.Channel;
import com.xxkxxy.dao.ChannelDao;

@Service
public class ChannelService {

    @Resource
    private ChannelDao channelDao;

    public int insert(Channel pojo){
        return channelDao.insert(pojo);
    }

    public int insertList(List< Channel> pojos){
        return channelDao.insertList(pojos);
    }

    public List<Channel> select(Channel pojo){
        return channelDao.select(pojo);
    }

    public int update(Channel pojo){
        return channelDao.update(pojo);
    }

}
