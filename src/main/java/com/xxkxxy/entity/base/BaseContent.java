package com.xxkxxy.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 * 内容
 */
public class BaseContent implements Serializable {

    private static final long serialVersionUID = 1521790237495L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Integer contentId;

    /**
     * 用户id
     * isNullAble:1
     */
    private Integer userId;

    /**
     * 分类id
     * isNullAble:1
     */
    private Integer categoryId;

    /**
     * 创建时间
     * isNullAble:1
     */
    private java.time.LocalDateTime createDate;

    /**
     * isNullAble:1
     */
    private java.time.LocalDateTime pubDate;

    /**
     * 最后修改时间
     * isNullAble:1
     */
    private java.time.LocalDateTime lastModifyDate;

    /**
     * 内容类型
     * isNullAble:1
     */
    private Integer contentType;

    /**
     * 内容状态
     * isNullAble:1
     */
    private Integer status;

    /**
     * 编辑器类型
     * isNullAble:1
     */
    private Integer editorType;


    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getContentId() {
        return this.contentId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCreateDate(java.time.LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public java.time.LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setPubDate(java.time.LocalDateTime pubDate) {
        this.pubDate = pubDate;
    }

    public java.time.LocalDateTime getPubDate() {
        return this.pubDate;
    }

    public void setLastModifyDate(java.time.LocalDateTime lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public java.time.LocalDateTime getLastModifyDate() {
        return this.lastModifyDate;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Integer getContentType() {
        return this.contentType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }

    public Integer getEditorType() {
        return this.editorType;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentId='" + contentId + '\'' +
                "userId='" + userId + '\'' +
                "categoryId='" + categoryId + '\'' +
                "createDate='" + createDate + '\'' +
                "pubDate='" + pubDate + '\'' +
                "lastModifyDate='" + lastModifyDate + '\'' +
                "contentType='" + contentType + '\'' +
                "status='" + status + '\'' +
                "editorType='" + editorType + '\'' +
                '}';
    }
}
