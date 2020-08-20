package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceMachineType;
import com.powermax.mes.model.DeviceMachineTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMachineTypeMapper {
    long countByExample(DeviceMachineTypeExample example);

    int deleteByExample(DeviceMachineTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceMachineType record);

    int insertSelective(DeviceMachineType record);

    List<DeviceMachineType> selectByExample(DeviceMachineTypeExample example);

    DeviceMachineType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceMachineType record, @Param("example") DeviceMachineTypeExample example);

    int updateByExample(@Param("record") DeviceMachineType record, @Param("example") DeviceMachineTypeExample example);

    int updateByPrimaryKeySelective(DeviceMachineType record);

    int updateByPrimaryKey(DeviceMachineType record);
}