package com.gb.mapper;

import com.gb.po.Match;
import com.gb.po.MatchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatchMapper {
    long countByExample(MatchExample example);

    int deleteByExample(MatchExample example);

    int deleteByPrimaryKey(@Param("matchNo") Integer matchNo, @Param("workerNo") String workerNo);

    int insert(Match record);

    int insertSelective(Match record);

    List<Match> selectByExample(MatchExample example);

    Match selectByPrimaryKey(@Param("matchNo") Integer matchNo, @Param("workerNo") String workerNo);

    int updateByExampleSelective(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByPrimaryKeySelective(Match record);

    int updateByPrimaryKey(Match record);
}