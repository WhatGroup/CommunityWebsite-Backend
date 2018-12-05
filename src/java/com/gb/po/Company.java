package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {
    private Integer companyNo;

    private String companyName;

    private String companyPhone;

    private String workerName;

    private Integer workerSex;

    private String workerPhone;

    private String workerIdcard;

    private String workerEmail;

    private String companyEmail;

    private String password;

    private String legalName;

    private String legalIdcard;

    private Date createAt;

    private String address;

    private String legalIdPic1;

    private String legalIdPic0;

    private String licensePic1;

    private String licensePic0;

    public Integer getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Integer companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public Integer getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(Integer workerSex) {
        this.workerSex = workerSex;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone == null ? null : workerPhone.trim();
    }

    public String getWorkerIdcard() {
        return workerIdcard;
    }

    public void setWorkerIdcard(String workerIdcard) {
        this.workerIdcard = workerIdcard == null ? null : workerIdcard.trim();
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail == null ? null : workerEmail.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalIdcard() {
        return legalIdcard;
    }

    public void setLegalIdcard(String legalIdcard) {
        this.legalIdcard = legalIdcard == null ? null : legalIdcard.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLegalIdPic1() {
        return legalIdPic1;
    }

    public void setLegalIdPic1(String legalIdPic1) {
        this.legalIdPic1 = legalIdPic1 == null ? null : legalIdPic1.trim();
    }

    public String getLegalIdPic0() {
        return legalIdPic0;
    }

    public void setLegalIdPic0(String legalIdPic0) {
        this.legalIdPic0 = legalIdPic0 == null ? null : legalIdPic0.trim();
    }

    public String getLicensePic1() {
        return licensePic1;
    }

    public void setLicensePic1(String licensePic1) {
        this.licensePic1 = licensePic1 == null ? null : licensePic1.trim();
    }

    public String getLicensePic0() {
        return licensePic0;
    }

    public void setLicensePic0(String licensePic0) {
        this.licensePic0 = licensePic0 == null ? null : licensePic0.trim();
    }
}