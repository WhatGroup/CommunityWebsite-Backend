package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.Event;
import com.gb.po.EventExample;
import com.gb.vo.EventVo;
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

    EventVo selectByPrimaryKey(Integer eventNo);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKeyWithBLOBs(Event record);

    int updateByPrimaryKey(Event record);

    List<Event> selectWithOffset(PageParam pageParam);
}