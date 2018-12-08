package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.info.Message;
import com.gb.mapper.TypeMapper;
import com.gb.po.Type;
import com.gb.po.TypeExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("Duplicates")
@RestController("typeController")
@RequestMapping("v1/types")
public class TypeController {

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    TypeMapper typeMapper = ac.getBean("typeMapper", TypeMapper.class);


    @GetMapping
    public PageInfo getTypes(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
        long count = typeMapper.countByExample(new TypeExample());
        PageParam param = new PageParam(limit, offset, count);
        List<Type> list = typeMapper.selectWithOffset(param);
        return new PageInfo(param, list);
    }

    @GetMapping("{types_no}")
    public Type getType(@PathVariable("types_no") Integer typesNo) {
        return typeMapper.selectByPrimaryKey(typesNo);
    }

    @PostMapping
    public Message addType(@RequestBody Type type) {
        typeMapper.insert(type);
        return new Message(200, "添加类型成功");
    }

    @PutMapping("{types_no}")
    public Message modifyType(@PathVariable("types_no") Integer typesNo, @RequestBody Type type) {
        type.setTypeNo(typesNo);
        typeMapper.updateByPrimaryKey(type);
        return new Message(200, "修改类型成功");
    }

    @DeleteMapping("{types_no}")
    public Message deleteType(@PathVariable("types_no") Integer typesNo) {
        typeMapper.deleteByPrimaryKey(typesNo);
        return new Message(200, "删除类型成功");
    }
}
