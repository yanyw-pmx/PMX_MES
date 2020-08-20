package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceProduct;
import com.powermax.mes.model.ProduceProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface ProduceProductMapper {
    long countByExample(ProduceProductExample example);

    int deleteByExample(ProduceProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceProduct record);

    int insertSelective(ProduceProduct record);

    List<ProduceProduct> findAll();

    List<ProduceProduct> selectByExample(ProduceProductExample example);

    ProduceProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceProduct record, @Param("example") ProduceProductExample example);

    int updateByExample(@Param("record") ProduceProduct record, @Param("example") ProduceProductExample example);

    int updateByPrimaryKeySelective(ProduceProduct record);

    int updateByPrimaryKey(ProduceProduct record);
}