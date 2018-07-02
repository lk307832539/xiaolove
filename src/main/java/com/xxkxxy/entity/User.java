package com.xxkxxy.entity;

import com.xxkxxy.entity.base.BaseUser;

import javax.persistence.Entity;

/**
 * 用户类
 * Created by LK on 2017/5/7.
 */
@Entity
public class User extends BaseUser {
    private static final long serialVersionUID = 1L;

    public User() {
        super();
    }
}
