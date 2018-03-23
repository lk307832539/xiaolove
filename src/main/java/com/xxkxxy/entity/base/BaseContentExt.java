package com.xxkxxy.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 * 内容扩展
 */
public class BaseContentExt implements Serializable {

    private static final long serialVersionUID = 1521790240120L;


    /**
     * 主键
     * isNullAble:0
     */
    private Integer contentId;

    /**
     * 内容标题
     * isNullAble:1
     */
    private String title;

    /**
     * 内容
     * isNullAble:1
     */
    private String text;

    public Integer getContentId() {
        return this.contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ContentExt{" +
                "contentId='" + contentId + '\'' +
                "title='" + title + '\'' +
                "text='" + text + '\'' +
                '}';
    }

}
