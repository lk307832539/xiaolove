package com.xxkxxy.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.xxkxxy.entity.Channel;

public interface ChannelDao {

    int insert(@Param("pojo") Channel pojo);

    int insertList(@Param("pojos") List< Channel> pojo);

    List<Channel> select(@Param("pojo") Channel pojo);

    int update(@Param("pojo") Channel pojo);

}
