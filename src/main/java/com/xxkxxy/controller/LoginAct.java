package com.xxkxxy.controller;

import com.xxkxxy.entity.User;
import com.xxkxxy.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 将user的值存到session中
@SessionAttributes("user")
@Controller
public class LoginAct {
    @Resource
    private UserService userMng;

    @RequestMapping(value = "/login")
    public String login(String username, String password, HttpServletRequest request, HttpServletResponse response,
                        ModelMap model) throws Exception {

        String message = "";

        //如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                message = "账号不存在";
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                // throw new CustomException("用户名/密码错误");
                message = "用户名/密码错误";
            }
           /* else if("randomCodeError".equals(exceptionClassName)){
               // throw new CustomException("验证码错误 ");
            }
            */
            else {
                throw new Exception();//最终在异常处理器生成未知错误
            }
        }
        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面

        model.addAttribute("message", message);
        return "index/index";
    }

    @RequestMapping(value = "/simpleRegist")
    public String simpleRegist(String username, String email, String password, String repassword, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(email) && StringUtils.isNotBlank(password) && StringUtils.isNotBlank(repassword) && password.equals(repassword)) {
            User user = userMng.findByUserName(username);
            if (user == null) {
                user = new User();
                user.setUserName(username);
                user.setEmail(email);
                user.setPassword(password);
                userMng.insert(user);
            }
        }

        return "index/index";
    }

    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess(HttpServletRequest request, HttpServletResponse response,
                               ModelMap model) {
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        User user = this.userMng.findByUserName(username);
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

