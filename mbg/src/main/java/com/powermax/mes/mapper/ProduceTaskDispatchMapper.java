package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceTaskDispatch;
import com.powermax.mes.model.ProduceTaskDispatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceTaskDispatchMapper {
    long countByExample(ProduceTaskDispatchExample example);

    int deleteByExample(ProduceTaskDispatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceTaskDispatch record);

    int insertSelective(ProduceTaskDispatch record);

    List<ProduceTaskDispatch> selectByExample(ProduceTaskDispatchExample example);

    ProduceTaskDispatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceTaskDispatch record, @Param("example") ProduceTaskDispatchExample example);

    int updateByExample(@Param("record") ProduceTaskDispatch record, @Param("example") ProduceTaskDispatchExample example);

    int updateByPrimaryKeySelective(ProduceTaskDispatch record);

    int updateByPrimaryKey(ProduceTaskDispatch record);
}