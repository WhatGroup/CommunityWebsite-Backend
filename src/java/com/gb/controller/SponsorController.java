package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.mapper.SponsorMapper;
import com.gb.po.Sponsor;
import com.gb.po.SponsorExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("Duplicates")
@RestController("sponsorController")
@RequestMapping("v1/sponsors")
public class SponsorController {

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    SponsorMapper sponsorMapper = ac.getBean("sponsorMapper", SponsorMapper.class);


    @GetMapping
    public PageInfo getTypes(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
        long count = sponsorMapper.countByExample(new SponsorExample());
        PageParam param = new PageParam(limit, offset, count);
        List<Sponsor> list = sponsorMapper.selectWithOffset(param);

        return new PageInfo(param, list);
    }

}
