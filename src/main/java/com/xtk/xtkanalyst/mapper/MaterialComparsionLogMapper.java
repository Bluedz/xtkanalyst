package com.xtk.xtkanalyst.mapper;

import com.xtk.xtkanalyst.entity.MaterialComparsionLog;
import com.xtk.xtkanalyst.entity.MaterialComparsionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialComparsionLogMapper {
    long countByExample(MaterialComparsionLogExample example);

    int deleteByExample(MaterialComparsionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialComparsionLog record);

    int insertSelective(MaterialComparsionLog record);

    List<MaterialComparsionLog> selectByExample(MaterialComparsionLogExample example);

    MaterialComparsionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialComparsionLog record, @Param("example") MaterialComparsionLogExample example);

    int updateByExample(@Param("record") MaterialComparsionLog record, @Param("example") MaterialComparsionLogExample example);

    int updateByPrimaryKeySelective(MaterialComparsionLog record);

    int updateByPrimaryKey(MaterialComparsionLog record);
}