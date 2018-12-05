package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sponsor {
    private Integer sponsorNo;

    private Integer eventNo;

    private Integer companyNo;

    private Integer money;

    private String demand;

    public Integer getSponsorNo() {
        return sponsorNo;
    }

    public void setSponsorNo(Integer sponsorNo) {
        this.sponsorNo = sponsorNo;
    }

    public Integer getEventNo() {
        return eventNo;
    }

    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    public Integer getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Integer companyNo) {
        this.companyNo = companyNo;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }
}