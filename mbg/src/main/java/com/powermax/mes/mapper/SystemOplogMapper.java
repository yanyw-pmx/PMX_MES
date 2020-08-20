package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemOplog;
import com.powermax.mes.model.SystemOplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemOplogMapper {
    long countByExample(SystemOplogExample example);

    int deleteByExample(SystemOplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemOplog record);

    int insertSelective(SystemOplog record);

    List<SystemOplog> selectByExample(SystemOplogExample example);

    SystemOplog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemOplog record, @Param("example") SystemOplogExample example);

    int updateByExample(@Param("record") SystemOplog record, @Param("example") SystemOplogExample example);

    int updateByPrimaryKeySelective(SystemOplog record);

    int updateByPrimaryKey(SystemOplog record);
}