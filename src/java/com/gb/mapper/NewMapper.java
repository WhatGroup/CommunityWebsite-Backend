package com.gb.mapper;

import com.gb.po.New;
import com.gb.po.NewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewMapper {
    long countByExample(NewExample example);

    int deleteByExample(NewExample example);

    int deleteByPrimaryKey(@Param("newsNo") Integer newsNo, @Param("workerNo") String workerNo);

    int insert(New record);

    int insertSelective(New record);

    List<New> selectByExampleWithBLOBs(NewExample example);

    List<New> selectByExample(NewExample example);

    New selectByPrimaryKey(@Param("newsNo") Integer newsNo, @Param("workerNo") String workerNo);

    int updateByExampleSelective(@Param("record") New record, @Param("example") NewExample example);

    int updateByExampleWithBLOBs(@Param("record") New record, @Param("example") NewExample example);

    int updateByExample(@Param("record") New record, @Param("example") NewExample example);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKeyWithBLOBs(New record);

    int updateByPrimaryKey(New record);
}