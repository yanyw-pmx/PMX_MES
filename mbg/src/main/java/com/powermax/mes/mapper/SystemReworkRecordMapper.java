package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemReworkRecord;
import com.powermax.mes.model.SystemReworkRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemReworkRecordMapper {
    long countByExample(SystemReworkRecordExample example);

    int deleteByExample(SystemReworkRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemReworkRecord record);

    int insertSelective(SystemReworkRecord record);

    List<SystemReworkRecord> selectByExample(SystemReworkRecordExample example);

    SystemReworkRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemReworkRecord record, @Param("example") SystemReworkRecordExample example);

    int updateByExample(@Param("record") SystemReworkRecord record, @Param("example") SystemReworkRecordExample example);

    int updateByPrimaryKeySelective(SystemReworkRecord record);

    int updateByPrimaryKey(SystemReworkRecord record);
}