package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceEcufault;
import com.powermax.mes.model.DeviceEcufaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEcufaultMapper {
    long countByExample(DeviceEcufaultExample example);

    int deleteByExample(DeviceEcufaultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceEcufault record);

    int insertSelective(DeviceEcufault record);

    List<DeviceEcufault> selectByExample(DeviceEcufaultExample example);

    DeviceEcufault selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceEcufault record, @Param("example") DeviceEcufaultExample example);

    int updateByExample(@Param("record") DeviceEcufault record, @Param("example") DeviceEcufaultExample example);

    int updateByPrimaryKeySelective(DeviceEcufault record);

    int updateByPrimaryKey(DeviceEcufault record);
}