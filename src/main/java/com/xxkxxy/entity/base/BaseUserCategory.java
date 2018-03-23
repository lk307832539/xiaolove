package com.xxkxxy.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
public class BaseUserCategory implements Serializable {

    private static final long serialVersionUID = 1521790245500L;


    /**
     * 主键
     * 个人分类
     * isNullAble:0
     */
    private Integer userCategoryId;

    /**
     * 用户ID
     * isNullAble:1
     */
    private Integer userId;

    /**
     * 个人分类名称
     * isNullAble:1
     */
    private String categoryName;

    /**
     * 个人分类描述
     * isNullAble:1
     */
    private String categoryDescription;


    public void setUserCategoryId(Integer userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public Integer getUserCategoryId() {
        return this.userCategoryId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() {
        return this.categoryDescription;
    }

    @Override
    public String toString() {
        return "UserCategory{" +
                "userCategoryId='" + userCategoryId + '\'' +
                "userId='" + userId + '\'' +
                "categoryName='" + categoryName + '\'' +
                "categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
