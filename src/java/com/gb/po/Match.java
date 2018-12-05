package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Match {
    private Integer matchNo;

    private String workerNo;

    private String workerName;

    public Integer getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(Integer matchNo) {
        this.matchNo = matchNo;
    }

    public String getWorkerNo() {
        return workerNo;
    }

    public void setWorkerNo(String workerNo) {
        this.workerNo = workerNo == null ? null : workerNo.trim();
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }
}