package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
    private Integer eventNo;

    private String workerNo;

    private String eventTitle;

    private Date applyEnd;

    private Date trainEnd;

    private Date eventEnd;

    private Integer ifTrain;

    private Integer typeNo;

    private Integer recruitNum;

    private Integer applyNum;

    private Date createAt;

    private Date editAt;

    private String evenContent;

    private String eventPosition;

    private String recipient;

    private String recruitContent;

    public Integer getEventNo() {
        return eventNo;
    }

    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    public String getWorkerNo() {
        return workerNo;
    }

    public void setWorkerNo(String workerNo) {
        this.workerNo = workerNo == null ? null : workerNo.trim();
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
    }

    public Date getApplyEnd() {
        return applyEnd;
    }

    public void setApplyEnd(Date applyEnd) {
        this.applyEnd = applyEnd;
    }

    public Date getTrainEnd() {
        return trainEnd;
    }

    public void setTrainEnd(Date trainEnd) {
        this.trainEnd = trainEnd;
    }

    public Date getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(Date eventEnd) {
        this.eventEnd = eventEnd;
    }

    public Integer getIfTrain() {
        return ifTrain;
    }

    public void setIfTrain(Integer ifTrain) {
        this.ifTrain = ifTrain;
    }

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    public Integer getRecruitNum() {
        return recruitNum;
    }

    public void setRecruitNum(Integer recruitNum) {
        this.recruitNum = recruitNum;
    }

    public Integer getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getEditAt() {
        return editAt;
    }

    public void setEditAt(Date editAt) {
        this.editAt = editAt;
    }

    public String getEvenContent() {
        return evenContent;
    }

    public void setEvenContent(String evenContent) {
        this.evenContent = evenContent == null ? null : evenContent.trim();
    }

    public String getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(String eventPosition) {
        this.eventPosition = eventPosition == null ? null : eventPosition.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public String getRecruitContent() {
        return recruitContent;
    }

    public void setRecruitContent(String recruitContent) {
        this.recruitContent = recruitContent == null ? null : recruitContent.trim();
    }
}