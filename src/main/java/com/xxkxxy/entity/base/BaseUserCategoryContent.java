package com.xxkxxy.entity.base;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 用户文章分组实体抽象类
 */
@MappedSuperclass
public abstract class BaseUserCategoryContent implements Serializable {

    private int userCategoryId;
    private int contentId;

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
}
