package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceProductProcess;
import com.powermax.mes.model.ProduceProductProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceProductProcessMapper {
    long countByExample(ProduceProductProcessExample example);

    int deleteByExample(ProduceProductProcessExample example);

    int deleteByPrimaryKey(@Param("productId") Long productId, @Param("processId") Long processId);

    int insert(ProduceProductProcess record);

    int insertSelective(ProduceProductProcess record);

    List<ProduceProductProcess> selectByExample(ProduceProductProcessExample example);

    int updateByExampleSelective(@Param("record") ProduceProductProcess record, @Param("example") ProduceProductProcessExample example);

    int updateByExample(@Param("record") ProduceProductProcess record, @Param("example") ProduceProductProcessExample example);
}