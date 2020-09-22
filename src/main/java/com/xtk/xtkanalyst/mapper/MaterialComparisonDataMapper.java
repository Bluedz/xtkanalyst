package com.xtk.xtkanalyst.mapper;

import com.xtk.xtkanalyst.entity.MatComResult;
import com.xtk.xtkanalyst.entity.MaterialComparisonData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialComparisonDataMapper {
    int deleteByPrimaryKey(Integer id);
    void deleteAll();

    int insert(MaterialComparisonData record);

    int insertSelective(MaterialComparisonData record);

    MaterialComparisonData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaterialComparisonData record);

    int updateByPrimaryKey(MaterialComparisonData record);

    List<Object> matCom();
}