package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.Client;
import com.gb.po.ClientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientMapper {
    long countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(Integer clientNo);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExampleWithBLOBs(ClientExample example);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(Integer clientNo);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExampleWithBLOBs(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKeyWithBLOBs(Client record);

    int updateByPrimaryKey(Client record);

    List<Client> selectWithOffset(PageParam param);
}