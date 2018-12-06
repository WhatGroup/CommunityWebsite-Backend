package com.gb.vo;

import com.gb.domain.Page;
import com.gb.po.Event;

import java.util.List;

public class EventsVo {
    private Page paging;
    private List<Event> data;

    public Page getPaging() {
        return paging;
    }

    public void setPaging(Page paging) {
        this.paging = paging;
    }

    public List<Event> getData() {
        return data;
    }

    public void setData(List<Event> data) {
        this.data = data;
    }
}
