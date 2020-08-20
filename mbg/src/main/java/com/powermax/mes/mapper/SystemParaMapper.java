package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemPara;
import com.powermax.mes.model.SystemParaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemParaMapper {
    long countByExample(SystemParaExample example);

    int deleteByExample(SystemParaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemPara record);

    int insertSelective(SystemPara record);

    List<SystemPara> selectByExample(SystemParaExample example);

    SystemPara selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemPara record, @Param("example") SystemParaExample example);

    int updateByExample(@Param("record") SystemPara record, @Param("example") SystemParaExample example);

    int updateByPrimaryKeySelective(SystemPara record);

    int updateByPrimaryKey(SystemPara record);
}