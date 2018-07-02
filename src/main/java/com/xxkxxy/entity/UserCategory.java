package com.xxkxxy.entity;

import com.xxkxxy.entity.base.BaseUserCategory;

import javax.persistence.Entity;

/**
 * 用户分组类
 * Created by LK on 2017/5/7.
 */
@Entity
public class UserCategory extends BaseUserCategory{
    private static final long serialVersionUID = 1L;

    public UserCategory() {
        super();
    }
}
