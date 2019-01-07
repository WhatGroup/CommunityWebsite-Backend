package com.gb.controller;

import com.gb.domain.Assess;
import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.info.Message;
import com.gb.mapper.*;
import com.gb.po.*;
import com.gb.util.JwtUtils;
import com.gb.vo.EventVo;
import io.jsonwebtoken.Claims;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController("eventController")
@RequestMapping("v1/events")
public class EventController {


    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    EventMapper eventMapper = ac.getBean("eventMapper", EventMapper.class);
    TypeMapper typeMapper = ac.getBean("typeMapper", TypeMapper.class);
    WorkerMapper workerMapper = ac.getBean("workerMapper", WorkerMapper.class);
    TakePartMapper takePartMapper = ac.getBean("takePartMapper", TakePartMapper.class);
    ClientMapper clientMapper = ac.getBean("clientMapper", ClientMapper.class);

    @GetMapping
    public PageInfo getEvents(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort, HttpServletResponse response) {
//        EventExample eventExample = new EventExample();
//        List<Event> list = eventMapper.selectByExample(eventExample);
//        MappingExample.Criteria criteria = mappingExample.createCriteria();
//        criteria.andPasswordEqualTo("passwordpassword");
//        PageHelper.startPage(offset, limit, true);
        long count = eventMapper.countByExample(new EventExample());
        PageParam pageParam = new PageParam(limit, offset, count);
        List<Event> list = eventMapper.selectWithOffset(pageParam);
//        List<Mapping> list = mappingMapper.selectWithLimit(pageParam);
//        System.out.println(list);
        return new PageInfo(pageParam, list);
    }

    @GetMapping("{event_no}")
    public EventVo getEvent(HttpServletResponse response, @PathVariable("event_no") Integer eventNo) {
        EventVo eventVo = eventMapper.selectByPrimaryKey(eventNo);
        Worker worker = workerMapper.selectByPrimaryKey(eventVo.getWorkerNo());
        eventVo.setWorkerSex(worker.getSex());
        eventVo.setWorkerName(worker.getWorkerName());
        eventVo.setWorkerTitle(worker.getTitle());
        eventVo.setWorkerDepartment(worker.getDepartment());
        Type type = typeMapper.selectByPrimaryKey(eventVo.getTypeNo());
        eventVo.setTypeName(type.getTypeName());
        return eventVo;
    }

    @PostMapping()
    public Message addEvent(@RequestHeader("Authorization") String tokenValue, HttpServletResponse response, @RequestBody Event event) {
        Claims claims = JwtUtils.parseJWT(tokenValue);
        event.setWorkerNo(claims.getId());
        event.setCreateAt(new Date());
        event.setEditAt(new Date());
        eventMapper.insert(event);
        return new Message(200, "创建活动成功");
    }

    @PutMapping("{event_no}")
    public Message addEvent(@RequestHeader("Authorization") String tokenValue, HttpServletResponse response, @RequestBody Event event, @PathVariable("event_no") Integer eventNo) {
        event.setEditAt(new Date());
        event.setEventNo(eventNo);
        eventMapper.updateByPrimaryKeySelective(event);
        return new Message(200, "修改活动成功");
    }

    @DeleteMapping("{event_no}")
    public Message deleteEvent(@RequestHeader("Authorization") String tokenValue, @PathVariable("event_no") Integer eventNo) {
        eventMapper.deleteByPrimaryKey(eventNo);
        return new Message(200, "删除活动成功");
    }

    @GetMapping("{event_no}/clients")
    public PageInfo getTakePartEventClients(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort, HttpServletResponse response, @PathVariable("event_no") Integer eventNo) {
        TakePartExample takePartExample = new TakePartExample();
        TakePartExample.Criteria criteria = takePartExample.createCriteria();
        criteria.andEventNoEqualTo(eventNo);
        long total = takePartMapper.countByExample(takePartExample);
        PageParam pageParam = new PageParam(limit, offset, total);
        List<TakePart> list = takePartMapper.selectByExample(takePartExample);
        //通过义工id获取到义工的信息
        List<Client> clientList = new ArrayList<>();
        for (TakePart takePart : list) {
            Client client = clientMapper.selectByPrimaryKey(takePart.getClientNo());
            client.setClientPass(null);
            client.setBirthday(null);
            client.setIdCard(null);
            client.setGrade(null);
            client.setCreateAt(null);
            clientList.add(client);
        }
        return new PageInfo(pageParam, clientList);
    }

    @PutMapping("{event_no}/clients/{client_no}")
    public Message assessClient(@RequestHeader("Authorization") String tokenValue, HttpServletResponse response, @PathVariable("event_no") Integer eventNo, @PathVariable("client_no") Integer clientNo, @RequestBody Assess assess) {
        TakePartExample takePartExample = new TakePartExample();
        TakePartExample.Criteria criteria = takePartExample.createCriteria();
        criteria.andEventNoEqualTo(eventNo);
        criteria.andClientNoEqualTo(clientNo);
        TakePart takePart = takePartMapper.selectByExample(takePartExample).get(0);


        //员工表增加分数
        Client client = clientMapper.selectByPrimaryKey(clientNo);
        client.setGrade(client.getGrade() + assess.getGrade() - takePart.getGrade());
        clientMapper.updateByPrimaryKeySelective(client);

        takePart.setGrade(assess.getGrade());
        takePartMapper.updateByPrimaryKey(takePart);

        return new Message(200, client.getGrade() + "");
    }
}

