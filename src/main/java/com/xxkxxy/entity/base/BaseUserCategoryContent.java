package com.xxkxxy.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
public class BaseUserCategoryContent implements Serializable {

    private static final long serialVersionUID = 1521790247415L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Integer userCategoryId;

    /**
     * isNullAble:1
     */
    private Integer contentId;


    public void setUserCategoryId(Integer userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public Integer getUserCategoryId() {
        return this.userCategoryId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getContentId() {
        return this.contentId;
    }

    @Override
    public String toString() {
        return "UserCategoryContent{" +
                "userCategoryId='" + userCategoryId + '\'' +
                "contentId='" + contentId + '\'' +
                '}';
    }

}
