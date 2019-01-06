package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.info.Message;
import com.gb.mapper.ClientMapper;
import com.gb.mapper.EventMapper;
import com.gb.mapper.TakePartMapper;
import com.gb.mapper.TokenMapper;
import com.gb.po.*;
import com.gb.util.JwtUtils;
import com.gb.util.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("Duplicates")
@RestController("clientController")
@RequestMapping("v1/clients")
public class ClientController {

    private static final long TOKEN_TIME_TO_LIVE = 1000 * 60 * 60 * 24;
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");

    ClientMapper clientMapper = ac.getBean("clientMapper", ClientMapper.class);
    TakePartMapper takePartMapper = ac.getBean("takePartMapper", TakePartMapper.class);
    EventMapper eventMapper = ac.getBean("eventMapper", EventMapper.class);
    TokenMapper tokenMapper = ac.getBean("tokenMapper", TokenMapper.class);


    @PostMapping
    public Message registerClient(@RequestBody Client client, HttpServletResponse response) {
        //手机号长度和格式判断
        if (client.getPhone().length() != 11 || !StringUtils.isDigitsOnly(client.getPhone())) {
            response.setStatus(403);
            return new Message(403, "手机号格式错误");
        }

        //邮箱格式判断
        if (!StringUtils.isEmailFormat(client.getEmail())) {
            response.setStatus(403);
            return new Message(403, "邮箱格式错误");
        }

        //身份证号长度和格式判断
        if (client.getIdCard().length() != 18 || !StringUtils.isDigitsOnly(client.getIdCard())) {
            response.setStatus(403);
            return new Message(403, "身份证号格式错误");
        }

        //判断手机号是否重复
        ClientExample ce1 = new ClientExample();
        ClientExample.Criteria cc1 = ce1.createCriteria();
        cc1.andPhoneEqualTo(client.getPhone());
        List<Client> clientList1 = clientMapper.selectByExample(ce1);
        if (clientList1.size() > 0) {
            response.setStatus(403);
            return new Message(403, "手机号已经被注册");
        }

        //判断邮箱是否重复
        ClientExample ce2 = new ClientExample();
        ClientExample.Criteria cc2 = ce2.createCriteria();
        cc2.andEmailEqualTo(client.getEmail());
        List<Client> clientList2 = clientMapper.selectByExample(ce2);
        if (clientList2.size() > 0) {
            response.setStatus(403);
            return new Message(403, "邮箱已经被注册");
        }

        //判断身份证是否重复
        ClientExample ce3 = new ClientExample();
        ClientExample.Criteria cc3 = ce3.createCriteria();
        cc3.andIdCardEqualTo(client.getIdCard());
        List<Client> clientList3 = clientMapper.selectByExample(ce3);
        if (clientList3.size() > 0) {
            response.setStatus(403);
            return new Message(403, "身份证已经被注册");
        }


        //设置创建日期
        client.setCreateAt(new Date());
        client.setClientPass(StringUtils.md5(client.getClientPass()));

        //添加账号
        clientMapper.insert(client);


        return new Message(200, client.getClientNo() + "");
    }

    @GetMapping
    public PageInfo getClients(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
        long count = clientMapper.countByExample(new ClientExample());

        PageParam param = new PageParam(limit, offset, count);
        List<Client> list = clientMapper.selectWithOffset(param);
        for (Client c : list) {
            c.setClientPass(null);
            c.setCreateAt(null);
        }
        return new PageInfo(param, list);
    }


    @PutMapping("{client_no}")
    public Message modifyClientInfo(@PathVariable("client_no") int clientNo, @RequestBody Client client, HttpServletResponse response) {
        Client c = clientMapper.selectByPrimaryKey(clientNo);
        client.setClientNo(clientNo);

        if (client.getPhone() != null && !c.getPhone().equals(client.getPhone())) {

            //手机号长度和格式判断
            if (client.getPhone().length() != 11 || !StringUtils.isDigitsOnly(client.getPhone())) {
                response.setStatus(403);
                return new Message(403, "手机号格式错误");
            } else {
                //判断手机号是否重复
                ClientExample ce1 = new ClientExample();
                ClientExample.Criteria cc1 = ce1.createCriteria();
                cc1.andPhoneEqualTo(client.getPhone());
                List<Client> clientList1 = clientMapper.selectByExample(ce1);
                if (clientList1.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "手机号已经被注册");
                }

            }
        }


        if (client.getEmail() != null && !c.getEmail().equals(client.getEmail())) {
            //邮箱格式判断
            if (!StringUtils.isEmailFormat(client.getEmail())) {
                response.setStatus(403);
                return new Message(403, "邮箱格式错误");
            } else {
                //判断邮箱是否重复
                ClientExample ce2 = new ClientExample();
                ClientExample.Criteria cc2 = ce2.createCriteria();
                cc2.andEmailEqualTo(client.getEmail());
                List<Client> clientList2 = clientMapper.selectByExample(ce2);
                if (clientList2.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "邮箱已经被注册");
                }
            }
        }

        if (client.getIdCard() != null && !c.getPhone().equals(client.getPhone())) {
            if (client.getIdCard().length() != 18 || !StringUtils.isDigitsOnly(client.getIdCard())) {
                //身份证号长度和格式判断
                response.setStatus(403);
                return new Message(403, "身份证号格式错误");
            } else {
                //判断身份证是否重复
                ClientExample ce3 = new ClientExample();
                ClientExample.Criteria cc3 = ce3.createCriteria();
                cc3.andIdCardEqualTo(client.getIdCard());
                List<Client> clientList3 = clientMapper.selectByExample(ce3);
                if (clientList3.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "身份证已经被注册");
                }
            }
        }

        if (client.getClientPass() != null) {
            client.setClientPass(StringUtils.md5(client.getClientPass()));
        }

        clientMapper.updateByPrimaryKeySelective(client);
        return new Message(200, "修改成功");
    }

    @GetMapping("token")
    public Message getToken(int clientNo, String password, HttpServletResponse response) {
        Client client = clientMapper.selectByPrimaryKey(clientNo);
        if (client == null) {
            response.setStatus(403);
            return new Message(403, "暂无该用户");
        }
        if (!client.getClientPass().equals(StringUtils.md5(password))) {
            response.setStatus(403);
            return new Message(403, "密码错误");
        }
        String tokenValue = JwtUtils.createJWT(clientNo + "", "wgb", "", -1);
        Token token = new Token();
        token.setTokenValue(tokenValue);
        token.setExpiredTime(new Date(System.currentTimeMillis() + TOKEN_TIME_TO_LIVE));
        tokenMapper.insert(token);
        return new Message(200, tokenValue);
    }

    @DeleteMapping("token")
    public Message deleteToken(@RequestHeader("Authorization") String tokenValue, HttpServletResponse response) {
        TokenExample tokenExample = new TokenExample();
        TokenExample.Criteria tc = tokenExample.createCriteria();
        tc.andTokenValueEqualTo(tokenValue);
        List<Token> tokenList = tokenMapper.selectByExample(tokenExample);
        if (tokenList.isEmpty()) {
            response.setStatus(401);
            return new Message(401, "退出登录失败，无效token");
        }

        tokenMapper.deleteByExample(tokenExample);
        return new Message(200, "退出登录成功");
    }

    @PostMapping("{client_no}/events/{event_no}")
    public Message takePartEvent(@PathVariable("client_no") int clientNo, @PathVariable("event_no") int eventNo) {
        TakePart takePart = new TakePart();
        takePart.setClientNo(clientNo);
        takePart.setEventNo(eventNo);
        takePart.setGrade(0);
        takePartMapper.insert(takePart);
        return new Message(200, "报名成功");
    }

    @DeleteMapping("{client_no}/events/{event_no}")
    public Message cancelEvent(@PathVariable("client_no") int clientNo, @PathVariable("event_no") int eventNo) {
        TakePartExample example = new TakePartExample();
        TakePartExample.Criteria criteria = example.createCriteria();
        criteria.andClientNoEqualTo(clientNo);
        criteria.andEventNoEqualTo(eventNo);
        takePartMapper.deleteByExample(example);
        return new Message(200, "取消报名成功");
    }


    @GetMapping("{client_no}")
    public Client getClient(@PathVariable("client_no") Integer clientNo) {
        return clientMapper.selectByPrimaryKey(clientNo);
    }

    @GetMapping("{client_no}/events")
    public PageInfo getTakePartEvent(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort, @PathVariable("client_no") Integer clientNo) {
        TakePartExample takePartExample = new TakePartExample();
        TakePartExample.Criteria criteria = takePartExample.createCriteria();
        criteria.andClientNoEqualTo(clientNo);
        long count = takePartMapper.countByExample(takePartExample);
        PageParam param = new PageParam(limit, offset, count);
        List<TakePart> takePartList = takePartMapper.selectByExampleWithOffset(takePartExample);
        List<Event> eventList = new ArrayList<>();
        for (TakePart takePart : takePartList) {
            eventList.add(eventMapper.selectByPrimaryKey(takePart.getEventNo()));
        }
        return new PageInfo(param, eventList);
    }
}
