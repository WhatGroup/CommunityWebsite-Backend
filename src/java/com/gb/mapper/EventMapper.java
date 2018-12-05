package com.gb.mapper;

import com.gb.po.Event;
import com.gb.po.EventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventMapper {
    long countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(Integer eventNo);

    int insert(Event record);

    int insertSelective(Event record);

    List<Event> selectByExampleWithBLOBs(EventExample example);

    List<Event> selectByExample(EventExample example);

    Event selectByPrimaryKey(Integer eventNo);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKeyWithBLOBs(Event record);

    int updateByPrimaryKey(Event record);
}