package com.gb.mapper;

import com.gb.po.TakePart;
import com.gb.po.TakePartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TakePartMapper {
    long countByExample(TakePartExample example);

    int deleteByExample(TakePartExample example);

    int deleteByPrimaryKey(Integer takepartNo);

    int insert(TakePart record);

    int insertSelective(TakePart record);

    List<TakePart> selectByExample(TakePartExample example);

    TakePart selectByPrimaryKey(Integer takepartNo);

    int updateByExampleSelective(@Param("record") TakePart record, @Param("example") TakePartExample example);

    int updateByExample(@Param("record") TakePart record, @Param("example") TakePartExample example);

    int updateByPrimaryKeySelective(TakePart record);

    int updateByPrimaryKey(TakePart record);

    List<TakePart> selectByExampleWithOffset(TakePartExample example);
}