package com.xxkxxy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1521621699473L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nikeName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 最后登录时间
     */
    private java.time.LocalDateTime lastLoginTime;

    /**
     * 最后登录ip
     */
    private String lastLoginIp;

    /**
     * 登录次数
     */
    private String loginCount;

    /**
     * 验证码
     */
    private String validateCode;

    /**
     * 积分
     */
    private Integer score;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserExt userExt;


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getNikeName() {
        return this.nikeName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setLastLoginTime(java.time.LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public java.time.LocalDateTime getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    public String getLoginCount() {
        return this.loginCount;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getValidateCode() {
        return this.validateCode;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public UserExt getUserExt() {
        return userExt;
    }

    public void setUserExt(UserExt userExt) {
        this.userExt = userExt;
    }

    public Integer getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
                "userId='" + userId + '\'' +
                "userName='" + userName + '\'' +
                "nikeName='" + nikeName + '\'' +
                "email='" + email + '\'' +
                "password='" + password + '\'' +
                "salt='" + salt + '\'' +
                "lastLoginTime='" + lastLoginTime + '\'' +
                "lastLoginIp='" + lastLoginIp + '\'' +
                "loginCount='" + loginCount + '\'' +
                "validateCode='" + validateCode + '\'' +
                "score='" + score + '\'' +
                '}';
    }

}
