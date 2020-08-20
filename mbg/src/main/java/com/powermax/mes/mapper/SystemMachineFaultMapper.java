package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemMachineFault;
import com.powermax.mes.model.SystemMachineFaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMachineFaultMapper {
    long countByExample(SystemMachineFaultExample example);

    int deleteByExample(SystemMachineFaultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemMachineFault record);

    int insertSelective(SystemMachineFault record);

    List<SystemMachineFault> selectByExample(SystemMachineFaultExample example);

    SystemMachineFault selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemMachineFault record, @Param("example") SystemMachineFaultExample example);

    int updateByExample(@Param("record") SystemMachineFault record, @Param("example") SystemMachineFaultExample example);

    int updateByPrimaryKeySelective(SystemMachineFault record);

    int updateByPrimaryKey(SystemMachineFault record);
}