package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.info.Message;
import com.gb.mapper.*;
import com.gb.po.New;
import com.gb.po.NewExample;
import com.gb.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@SuppressWarnings("Duplicates")
@CrossOrigin
@RestController("newController")
@RequestMapping("v1/news")
public class NewController {

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    NewMapper newMapper = ac.getBean("newMapper", NewMapper.class);


    @GetMapping
    public PageInfo getEvents(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
        long count = newMapper.countByExample(new NewExample());
        PageParam pageParam = new PageParam(limit, offset, count);
        List<New> list = newMapper.selectWithOffset(pageParam);
        return new PageInfo(new PageParam(limit, offset, count), list);
    }

    @GetMapping("{news_no}")
    public New getEvent(@PathVariable("news_no") Integer newsNo) {
        return newMapper.selectByPrimaryKey(newsNo);
    }

    @PostMapping
    public Message addNew(@RequestHeader("Authorization") String tokenValue, @RequestBody New newNews) {
        Claims claims = JwtUtils.parseJWT(tokenValue);
        newNews.setWorkerNo(claims.getId());
        newNews.setCreateAt(new Date());
        newNews.setEditAt(new Date());
        newMapper.insert(newNews);
        return new Message(200, "添加新闻成功");
    }

    @PutMapping("{news_no}")
    public Message modifyNew(@RequestHeader("Authorization") String tokenValue, @RequestBody New newNew, @PathVariable("news_no") Integer newsNo) {
        newNew.setNewsNo(newsNo);
        newNew.setEditAt(new Date());
        newMapper.updateByPrimaryKeySelective(newNew);
        return new Message(200, "修改新闻成功");
    }

    @DeleteMapping("{news_no}")
    public Message deleteNew(@PathVariable("news_no") Integer news_no) {
        newMapper.deleteByPrimaryKey(news_no);
        return new Message(200, "删除新闻成功");
    }
}
