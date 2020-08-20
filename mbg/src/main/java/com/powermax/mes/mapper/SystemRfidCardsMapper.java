package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRfidCards;
import com.powermax.mes.model.SystemRfidCardsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRfidCardsMapper {
    long countByExample(SystemRfidCardsExample example);

    int deleteByExample(SystemRfidCardsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemRfidCards record);

    int insertSelective(SystemRfidCards record);

    List<SystemRfidCards> selectByExample(SystemRfidCardsExample example);

    SystemRfidCards selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemRfidCards record, @Param("example") SystemRfidCardsExample example);

    int updateByExample(@Param("record") SystemRfidCards record, @Param("example") SystemRfidCardsExample example);

    int updateByPrimaryKeySelective(SystemRfidCards record);

    int updateByPrimaryKey(SystemRfidCards record);
}