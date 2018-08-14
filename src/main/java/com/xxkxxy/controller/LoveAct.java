package com.xxkxxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LK on 2018/8/14.
 */
@Controller
@RequestMapping("/love")
public class LoveAct {
    @RequestMapping("/timeLine")
    public String timeLine(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "timeLine/index";
    }
}
