package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceEcufaultRecord;
import com.powermax.mes.model.DeviceEcufaultRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEcufaultRecordMapper {
    long countByExample(DeviceEcufaultRecordExample example);

    int deleteByExample(DeviceEcufaultRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceEcufaultRecord record);

    int insertSelective(DeviceEcufaultRecord record);

    List<DeviceEcufaultRecord> selectByExample(DeviceEcufaultRecordExample example);

    DeviceEcufaultRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceEcufaultRecord record, @Param("example") DeviceEcufaultRecordExample example);

    int updateByExample(@Param("record") DeviceEcufaultRecord record, @Param("example") DeviceEcufaultRecordExample example);

    int updateByPrimaryKeySelective(DeviceEcufaultRecord record);

    int updateByPrimaryKey(DeviceEcufaultRecord record);
}