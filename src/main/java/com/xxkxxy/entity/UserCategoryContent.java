package com.xxkxxy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
@Entity
public class UserCategoryContent implements Serializable {

    private static final long serialVersionUID = 1521790247415L;

    @Id
    @GeneratedValue
    private Integer userCategoryId;

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
