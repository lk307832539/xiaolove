package com.xxkxxy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 * 栏目POJO 是对系统中栏目信息
 */
@Entity
public class Channel implements Serializable {

    private static final long serialVersionUID = 1521790204046L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer channelId;

    /**
     * 栏目名称
     */
    private String channelName;

    /**
     * 父栏目
     */
    private Integer parentId;

    /**
     * 是否显示
     */
    private String isDisplay;

    /**
     * 栏目图片
     */
    private String titleImg;

    /**
     * 栏目简介
     */
    private String description;


    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getChannelId() {
        return this.channelId;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getIsDisplay() {
        return this.isDisplay;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getTitleImg() {
        return this.titleImg;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelId='" + channelId + '\'' +
                "channelName='" + channelName + '\'' +
                "parentId='" + parentId + '\'' +
                "isDisplay='" + isDisplay + '\'' +
                "titleImg='" + titleImg + '\'' +
                "description='" + description + '\'' +
                '}';
    }
}
