package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemWorkers;
import com.powermax.mes.model.SystemWorkersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemWorkersMapper {
    long countByExample(SystemWorkersExample example);

    int deleteByExample(SystemWorkersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemWorkers record);

    int insertSelective(SystemWorkers record);

    List<SystemWorkers> selectByExample(SystemWorkersExample example);

    SystemWorkers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemWorkers record, @Param("example") SystemWorkersExample example);

    int updateByExample(@Param("record") SystemWorkers record, @Param("example") SystemWorkersExample example);

    int updateByPrimaryKeySelective(SystemWorkers record);

    int updateByPrimaryKey(SystemWorkers record);
}