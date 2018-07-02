package com.xxkxxy.service;

import com.xxkxxy.dao.ChannelDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChannelService {

    @Resource
    private ChannelDao channelDao;

}
