package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemGroupOutput;
import com.powermax.mes.model.SystemGroupOutputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemGroupOutputMapper {
    long countByExample(SystemGroupOutputExample example);

    int deleteByExample(SystemGroupOutputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemGroupOutput record);

    int insertSelective(SystemGroupOutput record);

    List<SystemGroupOutput> selectByExample(SystemGroupOutputExample example);

    SystemGroupOutput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemGroupOutput record, @Param("example") SystemGroupOutputExample example);

    int updateByExample(@Param("record") SystemGroupOutput record, @Param("example") SystemGroupOutputExample example);

    int updateByPrimaryKeySelective(SystemGroupOutput record);

    int updateByPrimaryKey(SystemGroupOutput record);
}