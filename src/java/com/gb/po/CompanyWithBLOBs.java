package com.gb.po;

public class CompanyWithBLOBs extends Company {
    private String address;

    private String legalIdPic1;

    private String legalIdPic0;

    private String licensePic1;

    private String licensePic0;

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