package com.xxkxxy.controller;

import com.xxkxxy.entity.User;
import com.xxkxxy.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 将user的值存到session中
@SessionAttributes("user")
@Controller
public class LoginAct {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(String username, String password, HttpSession session, HttpServletRequest request,
                        ModelMap model) throws Exception {

        String message = "";

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            String userName = subject.getPrincipal().toString();
            User user = userService.findByUserName(userName);
            session.setAttribute("user", user);
            return "index/index";
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return "index/index";//返回登录页面
        }

    }

    @RequestMapping(value = "/simpleRegist")
    public String simpleRegist(String username, String email, String password, String repassword, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(email) && StringUtils.isNotBlank(password) && StringUtils.isNotBlank(repassword) && password.equals(repassword)) {
            User user = userService.findByUserName(username);
            if (user == null) {
                user = new User();
                user.setUserName(username);
                user.setEmail(email);
                user.setPassword(password);
                userService.save(user);
            }
        }

        return "index/index";
    }

    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess(HttpServletRequest request, HttpServletResponse response,
                               ModelMap model) {
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        User user = this.userService.findByUserName(username);
        if (user != null) {
            model.addAttribute("user", user);
        }

        return "index/index";

    }


    /*@RequestMapping(value = "/loginout")
    public String loginOut(SessionStatus sessionStatus, HttpSession session) {
        sessionStatus.setComplete();// 将所有的会话注销
        session.removeAttribute("user");
        return "index";
    }*/
}

