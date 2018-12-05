package com.gb.po;

public class MatchKey {
    private Integer matchNo;

    private String workerNo;

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
}