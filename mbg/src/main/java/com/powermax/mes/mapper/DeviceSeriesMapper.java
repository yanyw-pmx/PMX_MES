package com.powermax.mes.mapper;

import com.powermax.mes.model.DeviceSeries;
import com.powermax.mes.model.DeviceSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceSeriesMapper {
    long countByExample(DeviceSeriesExample example);

    int deleteByExample(DeviceSeriesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceSeries record);

    int insertSelective(DeviceSeries record);

    List<DeviceSeries> selectByExample(DeviceSeriesExample example);

    DeviceSeries selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceSeries record, @Param("example") DeviceSeriesExample example);

    int updateByExample(@Param("record") DeviceSeries record, @Param("example") DeviceSeriesExample example);

    int updateByPrimaryKeySelective(DeviceSeries record);

    int updateByPrimaryKey(DeviceSeries record);
}