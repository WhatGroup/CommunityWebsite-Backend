package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token {
    private Integer id;

    private String tokenValue;

    private Date expiredTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue == null ? null : tokenValue.trim();
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }
}