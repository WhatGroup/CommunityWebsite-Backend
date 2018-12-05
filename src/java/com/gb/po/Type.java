package com.gb.po;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Type {
    private Integer typeNo;

    private String typeName;

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}