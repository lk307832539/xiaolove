package com.xxkxxy.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by LK on 2018/3/23.
 */
@Entity
public class UserExt implements Serializable {

    private static final long serialVersionUID = 1521790255151L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    private String userImg;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 生日
     */
    private java.time.LocalDate birthday;

    /**
     * 性别
     */
    private String sex;

    private String wechat;

    private String qq;

    /**
     * 地址
     */
    private String address;

    /**
     * 行业
     */
    private String profession;

    /**
     * 个人简介
     */
    private String intro;

    @OneToOne(mappedBy = "userExt")
    private User user;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserImg() {
        return this.userImg;
    }


    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setBirthday(java.time.LocalDate birthday) {
        this.birthday = birthday;
    }

    public java.time.LocalDate getBirthday() {
        return this.birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getWechat() {
        return this.wechat;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return this.qq;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntro() {
        return this.intro;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserExt{" +
                "userId='" + userId + '\'' +
                "userImg='" + userImg + '\'' +
                "realName='" + realName + '\'' +
                "birthday='" + birthday + '\'' +
                "sex='" + sex + '\'' +
                "wechat='" + wechat + '\'' +
                "qq='" + qq + '\'' +
                "address='" + address + '\'' +
                "profession='" + profession + '\'' +
                "intro='" + intro + '\'' +
                '}';
    }
}
