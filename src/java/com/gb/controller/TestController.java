package com.gb.controller;

import com.gb.mapper.UserMapper;
import com.gb.po.Test;
import com.gb.po.User;
import com.gb.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("Duplicates")
@Controller("testController")
@RequestMapping("test")
public class TestController {
    @RequestMapping("hello")
    public @ResponseBody
    User hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.getWriter().println("hello,this is the ssm project!");
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
        User user = userMapper.findUserById(96);
        return user;
    }

    @RequestMapping("testStatus")
    public void testStatus(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setStatus(401);
        response.sendError(401, "错误界面");
//        response.getWriter().println("hello,this is the ssm project!");
    }

    @RequestMapping("register")
    public void register(Test test, HttpServletResponse response) throws IOException {
        String str = JwtUtil.createJWT("12", "12313", "{\"name\":\"小明大咖喱块嘎嘎康\",\"age\":12,\"password\":\"134544646467461\"}", 100000);
        response.getWriter().write(str);
        Cookie cookie = new Cookie("token", str);
        cookie.setMaxAge(20);
        response.addCookie(cookie);
    }

    @RequestMapping("login")
    public void login(@CookieValue(value = "token") String token, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Claims claims = JwtUtil.parseJWT(token);
//        claims.setExpiration();
        response.getWriter().write(claims.getSubject());
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            System.out.println(c.getName() + "," + c.getValue());
        }
        String str = JwtUtil.createJWT("12", "12313", "{\"name\":\"小明大咖喱块嘎嘎康\",\"age\":12,\"password\":\"134544646467461\"}", 100000);
        response.getWriter().write(str);
        Cookie cookie = new Cookie("token", str);
        cookie.setMaxAge(20);
        response.addCookie(cookie);
        request.getSession().setAttribute("token","");

    }

}
