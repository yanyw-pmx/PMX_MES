package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceMachineState;
import com.powermax.mes.model.DeviceMachineStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMachineStateMapper {
    long countByExample(DeviceMachineStateExample example);

    int deleteByExample(DeviceMachineStateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceMachineState record);

    int insertSelective(DeviceMachineState record);

    List<DeviceMachineState> selectByExample(DeviceMachineStateExample example);

    DeviceMachineState selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceMachineState record, @Param("example") DeviceMachineStateExample example);

    int updateByExample(@Param("record") DeviceMachineState record, @Param("example") DeviceMachineStateExample example);

    int updateByPrimaryKeySelective(DeviceMachineState record);

    int updateByPrimaryKey(DeviceMachineState record);
}