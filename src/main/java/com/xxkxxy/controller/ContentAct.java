package com.xxkxxy.controller;

import com.xxkxxy.entity.Content;
import com.xxkxxy.entity.ContentExt;
import com.xxkxxy.entity.User;
import com.xxkxxy.service.ContentExtService;
import com.xxkxxy.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by LK on 2017/5/9.
 */
@Controller
@RequestMapping(value = "/content")
public class ContentAct {
    @Resource
    private ContentService contentService;
    @Resource
    private ContentExtService contentExtService;

    @RequestMapping(value = "/add")
    public String addNewContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "content/add";
    }

    @RequestMapping(value = "/list")
    public String contentList(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        List<Content> list = contentService.findAll();

        model.addAttribute("list", list);

        return "content/list";
    }

    @RequestMapping(value = "/save")
    public String saveContent(String title, String txt, Integer editorType, HttpServletRequest request, HttpServletResponse response, ModelMap model) {

        User user = (User) request.getSession().getAttribute("user");
        Content content = new Content();
        content.setUser(user);
        content.setEditorType(editorType);
        content.setCreateDate(new Timestamp(System.currentTimeMillis()));
        content.setLastModifyDate(new Timestamp(System.currentTimeMillis()));
        content.setStatus(1);
        content.setPubDate(new Timestamp(System.currentTimeMillis()));
        contentService.save(content);

        ContentExt contentExt = new ContentExt();
        contentExt.setContent(content);
        contentExt.setTitle(title);
        contentExt.setText(txt);
        contentExtService.save(contentExt);
        content.setContentExt(contentExt);

        return "redirect:/content/list.do";
    }

    @RequestMapping(value = "/view")
    public String view(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {

        Content content = contentService.getOne(id);

        model.addAttribute("content", content);
        return "content/view";
    }

}
