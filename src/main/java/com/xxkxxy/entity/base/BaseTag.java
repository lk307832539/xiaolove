package com.xxkxxy.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
public class BaseTag implements Serializable {

    private static final long serialVersionUID = 1521790242446L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Integer tagId;

    /**
     * 标签名称
     * isNullAble:1
     */
    private String tagName;

    /**
     * 标签描述
     * isNullAble:1
     */
    private String tagDescription;

    public Integer getTagId() {
        return this.tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return this.tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId='" + tagId + '\'' +
                "tagName='" + tagName + '\'' +
                "tagDescription='" + tagDescription + '\'' +
                '}';
    }
}
