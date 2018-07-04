package com.xxkxxy.entity.base;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户文章分组实体抽象类
 */
@MappedSuperclass
public abstract class BaseUserCategoryContent implements Serializable {

    private int userCategoryId;
    private int contentId;

    @CreatedDate
    private Timestamp createTime;

    public BaseUserCategoryContent() {
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
