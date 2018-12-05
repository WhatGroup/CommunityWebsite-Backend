package com.gb.mapper;

import com.gb.po.Worker;
import com.gb.po.WorkerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerMapper {
    long countByExample(WorkerExample example);

    int deleteByExample(WorkerExample example);

    int deleteByPrimaryKey(String workerNo);

    int insert(Worker record);

    int insertSelective(Worker record);

    List<Worker> selectByExampleWithBLOBs(WorkerExample example);

    List<Worker> selectByExample(WorkerExample example);

    Worker selectByPrimaryKey(String workerNo);

    int updateByExampleSelective(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByExampleWithBLOBs(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByExample(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByPrimaryKeySelective(Worker record);

    int updateByPrimaryKeyWithBLOBs(Worker record);

    int updateByPrimaryKey(Worker record);
}