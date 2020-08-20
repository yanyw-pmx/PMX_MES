package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceManufacturer;
import com.powermax.mes.model.DeviceManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceManufacturerMapper {
    long countByExample(DeviceManufacturerExample example);

    int deleteByExample(DeviceManufacturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceManufacturer record);

    int insertSelective(DeviceManufacturer record);

    List<DeviceManufacturer> selectByExample(DeviceManufacturerExample example);

    DeviceManufacturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceManufacturer record, @Param("example") DeviceManufacturerExample example);

    int updateByExample(@Param("record") DeviceManufacturer record, @Param("example") DeviceManufacturerExample example);

    int updateByPrimaryKeySelective(DeviceManufacturer record);

    int updateByPrimaryKey(DeviceManufacturer record);
}