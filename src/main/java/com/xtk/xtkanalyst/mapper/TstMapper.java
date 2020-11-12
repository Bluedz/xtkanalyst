package com.xtk.xtkanalyst.mapper;

import com.xtk.xtkanalyst.entity.Tst;
import com.xtk.xtkanalyst.entity.TstExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TstMapper {
    long countByExample(TstExample example);

    int deleteByExample(TstExample example);

    int insert(Tst record);

    int insertSelective(Tst record);

    List<Tst> selectByExample(TstExample example);

    Tst sl1();

    int updateByExampleSelective(@Param("record") Tst record, @Param("example") TstExample example);

    int updateByExample(@Param("record") Tst record, @Param("example") TstExample example);

    // --

    List<Map> tstCrossDB();

    // --
}