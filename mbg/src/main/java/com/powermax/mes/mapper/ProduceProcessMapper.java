package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceProcess;
import com.powermax.mes.model.ProduceProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceProcessMapper {
    long countByExample(ProduceProcessExample example);

    int deleteByExample(ProduceProcessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceProcess record);

    int insertSelective(ProduceProcess record);

    List<ProduceProcess> selectByExample(ProduceProcessExample example);

    ProduceProcess selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceProcess record, @Param("example") ProduceProcessExample example);

    int updateByExample(@Param("record") ProduceProcess record, @Param("example") ProduceProcessExample example);

    int updateByPrimaryKeySelective(ProduceProcess record);

    int updateByPrimaryKey(ProduceProcess record);
}