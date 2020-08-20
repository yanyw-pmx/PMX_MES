package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceMachineRunstate;
import com.powermax.mes.model.DeviceMachineRunstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMachineRunstateMapper {
    long countByExample(DeviceMachineRunstateExample example);

    int deleteByExample(DeviceMachineRunstateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceMachineRunstate record);

    int insertSelective(DeviceMachineRunstate record);

    List<DeviceMachineRunstate> selectByExample(DeviceMachineRunstateExample example);

    DeviceMachineRunstate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceMachineRunstate record, @Param("example") DeviceMachineRunstateExample example);

    int updateByExample(@Param("record") DeviceMachineRunstate record, @Param("example") DeviceMachineRunstateExample example);

    int updateByPrimaryKeySelective(DeviceMachineRunstate record);

    int updateByPrimaryKey(DeviceMachineRunstate record);
}