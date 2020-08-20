package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRfidType;
import com.powermax.mes.model.SystemRfidTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRfidTypeMapper {
    long countByExample(SystemRfidTypeExample example);

    int deleteByExample(SystemRfidTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemRfidType record);

    int insertSelective(SystemRfidType record);

    List<SystemRfidType> selectByExample(SystemRfidTypeExample example);

    SystemRfidType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemRfidType record, @Param("example") SystemRfidTypeExample example);

    int updateByExample(@Param("record") SystemRfidType record, @Param("example") SystemRfidTypeExample example);

    int updateByPrimaryKeySelective(SystemRfidType record);

    int updateByPrimaryKey(SystemRfidType record);
}