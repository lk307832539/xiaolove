package com.xxkxxy.entity.base;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by LK on 2018/3/23.
 */
@MappedSuperclass
public class BaseContentChannel implements Serializable {

    private static final long serialVersionUID = 1521790247415L;

    private Integer channelId;
    private Integer contentId;

    @CreatedDate
    private Timestamp createTime;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BaseChannelContent{" +
                "channelId=" + channelId +
                ", contentId=" + contentId +
                '}';
    }
}
