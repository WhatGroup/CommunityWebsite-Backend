package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.New;
import com.gb.po.NewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewMapper {
    long countByExample(NewExample example);

    int deleteByExample(NewExample example);

    int deleteByPrimaryKey(Integer newsNo);

    int insert(New record);

    int insertSelective(New record);

    List<New> selectByExampleWithBLOBs(NewExample example);

    List<New> selectByExample(NewExample example);

    New selectByPrimaryKey(Integer newsNo);

    int updateByExampleSelective(@Param("record") New record, @Param("example") NewExample example);

    int updateByExampleWithBLOBs(@Param("record") New record, @Param("example") NewExample example);

    int updateByExample(@Param("record") New record, @Param("example") NewExample example);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKeyWithBLOBs(New record);

    int updateByPrimaryKey(New record);

    List<New> selectWithOffset(PageParam param);
}