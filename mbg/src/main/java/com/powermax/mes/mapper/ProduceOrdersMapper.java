package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceOrders;
import com.powermax.mes.model.ProduceOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceOrdersMapper {
    long countByExample(ProduceOrdersExample example);

    int deleteByExample(ProduceOrdersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceOrders record);

    int insertSelective(ProduceOrders record);

    List<ProduceOrders> selectByExample(ProduceOrdersExample example);

    ProduceOrders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceOrders record, @Param("example") ProduceOrdersExample example);

    int updateByExample(@Param("record") ProduceOrders record, @Param("example") ProduceOrdersExample example);

    int updateByPrimaryKeySelective(ProduceOrders record);

    int updateByPrimaryKey(ProduceOrders record);
}