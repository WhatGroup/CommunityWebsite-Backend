package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.Type;
import com.gb.po.TypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer typeNo);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer typeNo);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> selectWithOffset(PageParam param);
}