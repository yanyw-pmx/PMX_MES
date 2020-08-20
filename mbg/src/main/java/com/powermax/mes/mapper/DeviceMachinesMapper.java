package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceMachines;
import com.powermax.mes.model.DeviceMachinesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMachinesMapper {
    long countByExample(DeviceMachinesExample example);

    int deleteByExample(DeviceMachinesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceMachines record);

    int insertSelective(DeviceMachines record);

    List<DeviceMachines> selectByExample(DeviceMachinesExample example);

    DeviceMachines selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceMachines record, @Param("example") DeviceMachinesExample example);

    int updateByExample(@Param("record") DeviceMachines record, @Param("example") DeviceMachinesExample example);

    int updateByPrimaryKeySelective(DeviceMachines record);

    int updateByPrimaryKey(DeviceMachines record);
}