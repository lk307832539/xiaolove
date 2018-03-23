package com.xxkxxy.entity.base;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**  * Created by LK on 2018/3/23.  */
public class BaseUser implements Serializable {

    private static final long serialVersionUID = 1521621699473L;


    /**
    * 主键
    * 用户id
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 用户名
    * isNullAble:1
    */
    private String userName;

    /**
    * 昵称
    * isNullAble:1
    */
    private String nikeName;

    /**
    * 邮箱
    * isNullAble:1
    */
    private String email;

    /**
    * 密码
    * isNullAble:1
    */
    private String password;

    /**
    * 密码盐
    * isNullAble:1
    */
    private String salt;

    /**
    * 最后登录时间
    * isNullAble:1
    */
    private java.time.LocalDateTime lastLoginTime;

    /**
    * 最后登录ip
    * isNullAble:1
    */
    private String lastLoginIp;

    /**
    * 登录次数
    * isNullAble:1
    */
    private String loginCount;

    /**
    * 验证码
    * isNullAble:1
    */
    private String validateCode;

    /**
    * 积分
    * isNullAble:1
    */
    private Integer score;


    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setNikeName(String nikeName){
        this.nikeName = nikeName;
    }

    public String getNikeName(){
        return this.nikeName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setSalt(String salt){
        this.salt = salt;
    }

    public String getSalt(){
        return this.salt;
    }

    public void setLastLoginTime(java.time.LocalDateTime lastLoginTime){
        this.lastLoginTime = lastLoginTime;
    }

    public java.time.LocalDateTime getLastLoginTime(){
        return this.lastLoginTime;
    }

    public void setLastLoginIp(String lastLoginIp){
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginIp(){
        return this.lastLoginIp;
    }

    public void setLoginCount(String loginCount){
        this.loginCount = loginCount;
    }

    public String getLoginCount(){
        return this.loginCount;
    }

    public void setValidateCode(String validateCode){
        this.validateCode = validateCode;
    }

    public String getValidateCode(){
        return this.validateCode;
    }

    public void setScore(Integer score){
        this.score = score;
    }

    public Integer getScore(){
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
