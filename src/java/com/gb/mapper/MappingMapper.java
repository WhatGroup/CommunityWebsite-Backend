package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.Mapping;
import com.gb.po.MappingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MappingMapper {
    long countByExample(MappingExample example);

    int deleteByExample(MappingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping record);

    int insertSelective(Mapping record);

    List<Mapping> selectByExample(MappingExample example);

    Mapping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping record, @Param("example") MappingExample example);

    int updateByExample(@Param("record") Mapping record, @Param("example") MappingExample example);

    int updateByPrimaryKeySelective(Mapping record);

    int updateByPrimaryKey(Mapping record);

    List<Mapping> selectWithLimit(PageParam pageParam);
}