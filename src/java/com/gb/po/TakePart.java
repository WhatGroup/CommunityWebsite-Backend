package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TakePart {
    private Integer takepartNo;

    private Integer eventNo;

    private Integer clientNo;

    private Integer grade;

    public Integer getTakepartNo() {
        return takepartNo;
    }

    public void setTakepartNo(Integer takepartNo) {
        this.takepartNo = takepartNo;
    }

    public Integer getEventNo() {
        return eventNo;
    }

    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    public Integer getClientNo() {
        return clientNo;
    }

    public void setClientNo(Integer clientNo) {
        this.clientNo = clientNo;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}