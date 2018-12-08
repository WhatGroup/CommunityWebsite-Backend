package com.gb.vo;

import com.gb.po.Event;

public class EventVo extends Event {
    private String workerName;
    private int workerSex;
    private String workerDepartment;
    private String workerTitle;
    private String typeName;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(int workerSex) {
        this.workerSex = workerSex;
    }

    public String getWorkerDepartment() {
        return workerDepartment;
    }

    public void setWorkerDepartment(String workerDepartment) {
        this.workerDepartment = workerDepartment;
    }

    public String getWorkerTitle() {
        return workerTitle;
    }

    public void setWorkerTitle(String workerTitle) {
        this.workerTitle = workerTitle;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
