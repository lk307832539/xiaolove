package com.xxkxxy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
@Entity
public class ContentChannel implements Serializable {

    private static final long serialVersionUID = 1521790247415L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer channelId;

    private Integer contentId;

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

    @Override
    public String toString() {
        return "BaseChannelContent{" +
                "channelId=" + channelId +
                ", contentId=" + contentId +
                '}';
    }
}
