package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.info.Message;
import com.gb.mapper.CompanyMapper;
import com.gb.mapper.EventMapper;
import com.gb.mapper.SponsorMapper;
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
@RestController("companyController")
@RequestMapping("v1/companies")
public class CompanyController {

    private static final long TOKEN_TIME_TO_LIVE = 1000 * 60 * 60 * 24;
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    CompanyMapper companyMapper = ac.getBean("companyMapper", CompanyMapper.class);
    SponsorMapper sponsorMapper = ac.getBean("sponsorMapper", SponsorMapper.class);
    EventMapper eventMapper = ac.getBean("eventMapper", EventMapper.class);
    TokenMapper tokenMapper = ac.getBean("tokenMapper", TokenMapper.class);


    @GetMapping
    public PageInfo getCompanies(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort) {
        long count = companyMapper.countByExample(new CompanyExample());
        PageParam param = new PageParam(limit, offset, count);
        List<Company> list = companyMapper.selectWithOffset(param);
        for (Company c : list) {
            c.setPassword(null);
        }
        return new PageInfo(param, list);
    }

    @GetMapping("{company_no}")
    public Company getCompany(@PathVariable("company_no") Integer companyNo) {
        return companyMapper.selectByPrimaryKey(companyNo);
    }

    @GetMapping("{company_no}/events")
    public PageInfo getSponsorEvents(@RequestParam(required = false, defaultValue = "0") int offset, @RequestParam(required = false, defaultValue = "20") int limit, String sort, @PathVariable("company_no") Integer companyNo) {
        SponsorExample example = new SponsorExample();
        SponsorExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyNoEqualTo(companyNo);
        long count = sponsorMapper.countByExample(example);
        PageParam pageParam = new PageParam(limit, offset, count);
        List<Sponsor> sponsorList = sponsorMapper.selectByExampleWithOffset(example);
        List<Event> eventList = new ArrayList<>();
        for (Sponsor sponsor : sponsorList) {
            eventList.add(eventMapper.selectByPrimaryKey(sponsor.getEventNo()));
        }
        return new PageInfo(pageParam, eventList);
    }

    @PostMapping
    public Message registerCompany(@RequestBody Company company, HttpServletResponse response) {
        company.setPassword(StringUtils.md5(company.getPassword()));
        company.setCreateAt(new Date());
        companyMapper.insert(company);
        return new Message(200, company.getCompanyNo()+"");
    }

    @PutMapping("{company_no}")
    public Message updateCompany(@PathVariable("company_no") int companyNo, @RequestBody Company company, HttpServletResponse response) {
        if (company.getPassword() != null) {
            company.setPassword(StringUtils.md5(company.getPassword()));
        }
        company.setCompanyNo(companyNo);
        companyMapper.updateByPrimaryKeySelective(company);
        return new Message(200, "更新成功");
    }

    @GetMapping("token")
    public Message getToken(int companyNo, String password, HttpServletResponse response) {
        Company company = companyMapper.selectByPrimaryKey(companyNo);
        if (company == null) {
            response.setStatus(403);
            return new Message(403, "暂无该用户");
        }
        if (!company.getPassword().equals(StringUtils.md5(password))) {
            response.setStatus(403);
            return new Message(403, "密码错误");
        }
        String tokenValue = JwtUtils.createJWT(companyNo + "", "wgb", "", -1);
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

    @PostMapping("{company_no}/events/{event_no}")
    public Message sponsorEvent(@PathVariable("company_no") int companyNo, @PathVariable("event_no") int eventNo, @RequestBody Sponsor sponsor) {
        sponsor.setCompanyNo(companyNo);
        sponsor.setEventNo(eventNo);
        sponsorMapper.insert(sponsor);
        return new Message(200, "赞助成功");
    }
}
