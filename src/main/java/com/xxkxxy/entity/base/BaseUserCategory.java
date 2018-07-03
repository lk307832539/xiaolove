package com.xxkxxy.entity.base;

import com.xxkxxy.entity.User;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户分组实体抽象类
 */
@MappedSuperclass
public abstract class BaseUserCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userCategoryId;
    private String categoryName;
    private String categoryDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public BaseUserCategory() {
        super();
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
