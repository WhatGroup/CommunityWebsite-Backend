package com.gb.domain;

import java.util.List;

public class PageInfo {

    private PageParam param;
    private List data;

    public PageInfo(PageParam param, List data) {
        this.param = param;
        this.data = data;
    }

    public PageParam getParam() {
        return param;
    }

    public void setParam(PageParam param) {
        this.param = param;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
