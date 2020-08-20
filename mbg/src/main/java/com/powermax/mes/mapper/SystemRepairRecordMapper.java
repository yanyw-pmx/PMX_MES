package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRepairRecord;
import com.powermax.mes.model.SystemRepairRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRepairRecordMapper {
    long countByExample(SystemRepairRecordExample example);

    int deleteByExample(SystemRepairRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemRepairRecord record);

    int insertSelective(SystemRepairRecord record);

    List<SystemRepairRecord> selectByExample(SystemRepairRecordExample example);

    SystemRepairRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemRepairRecord record, @Param("example") SystemRepairRecordExample example);

    int updateByExample(@Param("record") SystemRepairRecord record, @Param("example") SystemRepairRecordExample example);

    int updateByPrimaryKeySelective(SystemRepairRecord record);

    int updateByPrimaryKey(SystemRepairRecord record);
}