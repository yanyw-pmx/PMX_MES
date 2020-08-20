package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceOrderDispatch;
import com.powermax.mes.model.ProduceOrderDispatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceOrderDispatchMapper {
    long countByExample(ProduceOrderDispatchExample example);

    int deleteByExample(ProduceOrderDispatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceOrderDispatch record);

    int insertSelective(ProduceOrderDispatch record);

    List<ProduceOrderDispatch> selectByExample(ProduceOrderDispatchExample example);

    ProduceOrderDispatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceOrderDispatch record, @Param("example") ProduceOrderDispatchExample example);

    int updateByExample(@Param("record") ProduceOrderDispatch record, @Param("example") ProduceOrderDispatchExample example);

    int updateByPrimaryKeySelective(ProduceOrderDispatch record);

    int updateByPrimaryKey(ProduceOrderDispatch record);
}