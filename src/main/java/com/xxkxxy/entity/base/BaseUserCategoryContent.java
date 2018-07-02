package com.xxkxxy.entity.base;

import com.xxkxxy.entity.Content;
import com.xxkxxy.entity.UserCategory;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 用户文章分组实体抽象类
 */
@MappedSuperclass
public abstract class BaseUserCategoryContent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userCategoryId;

    private UserCategory userCategory;
    private Content content;

    public BaseUserCategoryContent() {
        super();
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
