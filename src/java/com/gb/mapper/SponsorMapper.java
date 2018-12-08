package com.gb.mapper;

import com.gb.domain.PageParam;
import com.gb.po.Sponsor;
import com.gb.po.SponsorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SponsorMapper {
    long countByExample(SponsorExample example);

    int deleteByExample(SponsorExample example);

    int deleteByPrimaryKey(Integer sponsorNo);

    int insert(Sponsor record);

    int insertSelective(Sponsor record);

    List<Sponsor> selectByExampleWithBLOBs(SponsorExample example);

    List<Sponsor> selectByExample(SponsorExample example);

    Sponsor selectByPrimaryKey(Integer sponsorNo);

    int updateByExampleSelective(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByExampleWithBLOBs(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByExample(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByPrimaryKeySelective(Sponsor record);

    int updateByPrimaryKeyWithBLOBs(Sponsor record);

    int updateByPrimaryKey(Sponsor record);

    List<Sponsor> selectWithOffset(PageParam param);

    List<Sponsor> selectByExampleWithOffset(SponsorExample example);
}