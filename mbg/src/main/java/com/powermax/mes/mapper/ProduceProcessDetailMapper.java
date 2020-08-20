package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceProcessDetail;
import com.powermax.mes.model.ProduceProcessDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceProcessDetailMapper {
    long countByExample(ProduceProcessDetailExample example);

    int deleteByExample(ProduceProcessDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceProcessDetail record);

    int insertSelective(ProduceProcessDetail record);

    List<ProduceProcessDetail> selectByExample(ProduceProcessDetailExample example);

    ProduceProcessDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceProcessDetail record, @Param("example") ProduceProcessDetailExample example);

    int updateByExample(@Param("record") ProduceProcessDetail record, @Param("example") ProduceProcessDetailExample example);

    int updateByPrimaryKeySelective(ProduceProcessDetail record);

    int updateByPrimaryKey(ProduceProcessDetail record);
}