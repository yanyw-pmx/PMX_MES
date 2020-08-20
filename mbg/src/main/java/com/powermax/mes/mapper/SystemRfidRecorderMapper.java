package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRfidRecorder;
import com.powermax.mes.model.SystemRfidRecorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRfidRecorderMapper {
    long countByExample(SystemRfidRecorderExample example);

    int deleteByExample(SystemRfidRecorderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemRfidRecorder record);

    int insertSelective(SystemRfidRecorder record);

    List<SystemRfidRecorder> selectByExample(SystemRfidRecorderExample example);

    SystemRfidRecorder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemRfidRecorder record, @Param("example") SystemRfidRecorderExample example);

    int updateByExample(@Param("record") SystemRfidRecorder record, @Param("example") SystemRfidRecorderExample example);

    int updateByPrimaryKeySelective(SystemRfidRecorder record);

    int updateByPrimaryKey(SystemRfidRecorder record);
}