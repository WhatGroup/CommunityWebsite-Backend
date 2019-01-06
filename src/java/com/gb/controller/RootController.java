package com.gb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;
import java.io.File;

@RestController("rootController")
@RequestMapping("v1")
public class RootController {
    @PostMapping("upload")
    public void upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathRoot = request.getSession().getServletContext().getRealPath("/") + "IDCard/";
        File dir = new File(pathRoot);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String path = "";
        if (file != null && !file.isEmpty()) {
            //生成uuid作为文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            //获得文件类型（可以判断如果不是图片，禁止上传）
            String contentType = file.getContentType();
            //获得文件后缀名称
            String suffix = contentType.substring(contentType.indexOf("/") + 1);
            path = uuid + "." + suffix;
            File f = new File(pathRoot + path);
//            f.createNewFile();
            file.transferTo(f);
        }
        if (path.equals("")) {
            response.getWriter().write("");
        } else {
            response.getWriter().write("https://campus.gbdev.cn:8443/community/IDCard/" + path);
        }
    }

}
