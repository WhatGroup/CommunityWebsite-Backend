package com.gb.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gb.po.Worker;

import java.util.Date;

public class WorkerVo extends Worker {
    @Override
    public String getWorkerNo() {
        return super.getWorkerNo();
    }

    @Override
    public void setWorkerNo(String workerNo) {
        super.setWorkerNo(workerNo);
    }

    @JsonIgnoreProperties
    @Override
    public String getWorkerPass() {
        return super.getWorkerPass();
    }

    @Override
    public void setWorkerPass(String workerPass) {
        super.setWorkerPass(workerPass);
    }

    @Override
    public String getWorkerName() {
        return super.getWorkerName();
    }

    @Override
    public void setWorkerName(String workerName) {
        super.setWorkerName(workerName);
    }

    @Override
    public Integer getSex() {
        return super.getSex();
    }

    @Override
    public void setSex(Integer sex) {
        super.setSex(sex);
    }

    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(Date birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getIdCard() {
        return super.getIdCard();
    }

    @Override
    public void setIdCard(String idCard) {
        super.setIdCard(idCard);
    }

    @Override
    public Date getCreateAt() {
        return super.getCreateAt();
    }

    @Override
    public void setCreateAt(Date createAt) {
        super.setCreateAt(createAt);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
