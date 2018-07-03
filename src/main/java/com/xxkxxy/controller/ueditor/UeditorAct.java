package com.xxkxxy.controller.ueditor;

import com.xxkxxy.ueditor.ActionEnter;
import com.xxkxxy.ueditor.PathFormat;
import com.xxkxxy.ueditor.define.BaseState;
import com.xxkxxy.ueditor.define.State;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ueditor
 * Created by LK on 2017/5/21.
 */
@Controller
@RequestMapping(value = "/ueditor")
public class UeditorAct {

    @RequestMapping(value = "/init")
    public void initUeditor(String action, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException, JSONException {
        if ("config".equals(action)) {
            String rootPath = getClass().getResource("/").getPath();
            String configStr = new ActionEnter(request, rootPath).exec();
            response.getWriter().write(configStr);
        } else if ("uploadimage".equals(action)) {
            //不需要在spring配置文件中配置multipartResolver文件上传
            /*CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            resolver.setDefaultEncoding("utf-8");
            MultipartHttpServletRequest multiRequest = resolver.resolveMultipart(request);*/

            //在spring配置文件中配置multipartResolver文件上传
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            MultipartFile file = multiRequest.getFile("upfile");

            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
            String fileName = file.getOriginalFilename();
            String fileExt = fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
            String name = String.valueOf(System.currentTimeMillis()) + fileExt;
            String filePath = request.getServletContext().getRealPath("/") + "/upload/image/" + df.format(new Date());

            //todo 之后改为ftp上传文件
            //需要建立文件夹，如果文件夹不存在，会报找不到内容异常
            File folder = new File(filePath);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            File dest = new File(filePath, name);
            file.transferTo(dest);

            String showPath = request.getContextPath() + "/upload/image/" + df.format(new Date());

            //在ueditor上显示内上传图片内容
            State storageState = new BaseState(Boolean.TRUE);
            if (storageState.isSuccess()) {
                storageState.putInfo("url", PathFormat.format(showPath + "/" + name));
                storageState.putInfo("type", fileExt);
                storageState.putInfo("original", fileName);
            }
            response.getWriter().write(storageState.toJSONString());
        }
    }
}
