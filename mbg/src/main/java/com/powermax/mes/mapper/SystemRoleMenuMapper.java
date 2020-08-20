package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRoleMenu;
import com.powermax.mes.model.SystemRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRoleMenuMapper {
    long countByExample(SystemRoleMenuExample example);

    int deleteByExample(SystemRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemRoleMenu record);

    int insertSelective(SystemRoleMenu record);

    List<SystemRoleMenu> selectByExample(SystemRoleMenuExample example);

    SystemRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);

    int updateByExample(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);

    int updateByPrimaryKeySelective(SystemRoleMenu record);

    int updateByPrimaryKey(SystemRoleMenu record);
}