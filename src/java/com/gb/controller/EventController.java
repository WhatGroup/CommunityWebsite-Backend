package com.gb.controller;

import com.gb.mapper.EventMapper;
import com.gb.mapper.MappingMapper;
import com.gb.po.Mapping;
import com.gb.po.MappingExample;
import com.github.pagehelper.PageInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("eventController")
@RequestMapping("v1/events")
public class EventController {


    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    EventMapper eventMapper = ac.getBean("eventMapper", EventMapper.class);
    MappingMapper mappingMapper = ac.getBean("mappingMapper", MappingMapper.class);

    @GetMapping
    public PageInfo<Mapping> getEvents(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
//        PageHelper.startPage(offset, limit, true);
//        EventExample eventExample = new EventExample();
//        List<Event> list = eventMapper.selectByExample(eventExample);
        MappingExample mappingExample = new MappingExample();
        MappingExample.Criteria criteria = mappingExample.createCriteria();
        criteria.andPasswordEqualTo("passwordpassword");
        List<Mapping> list = mappingMapper.selectByExample(mappingExample);
//        PageInfo<Mapping> pageInfo = new PageInfo<>(list);
//        System.out.println("total:" + pageInfo.getTotal());
//        System.out.println("pages:" + pageInfo.getPages());
//        System.out.println("pageSize:" + pageInfo.getPageSize());
//        return pageInfo;
        return null;
    }
}
