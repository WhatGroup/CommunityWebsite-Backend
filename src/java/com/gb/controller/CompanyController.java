package com.gb.controller;

import com.gb.domain.PageInfo;
import com.gb.domain.PageParam;
import com.gb.mapper.CompanyMapper;
import com.gb.mapper.EventMapper;
import com.gb.mapper.SponsorMapper;
import com.gb.po.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
@RestController("companyController")
@RequestMapping("v1/companies")
public class CompanyController {

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    CompanyMapper companyMapper = ac.getBean("companyMapper", CompanyMapper.class);
    SponsorMapper sponsorMapper = ac.getBean("sponsorMapper", SponsorMapper.class);
    EventMapper eventMapper = ac.getBean("eventMapper", EventMapper.class);


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
}
