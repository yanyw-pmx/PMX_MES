package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemReworkFault;
import com.powermax.mes.model.SystemReworkFaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemReworkFaultMapper {
    long countByExample(SystemReworkFaultExample example);

    int deleteByExample(SystemReworkFaultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemReworkFault record);

    int insertSelective(SystemReworkFault record);

    List<SystemReworkFault> selectByExample(SystemReworkFaultExample example);

    SystemReworkFault selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemReworkFault record, @Param("example") SystemReworkFaultExample example);

    int updateByExample(@Param("record") SystemReworkFault record, @Param("example") SystemReworkFaultExample example);

    int updateByPrimaryKeySelective(SystemReworkFault record);

    int updateByPrimaryKey(SystemReworkFault record);
}