package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemRoles;
import com.powermax.mes.model.SystemRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRolesMapper {
    long countByExample(SystemRolesExample example);

    int deleteByExample(SystemRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemRoles record);

    int insertSelective(SystemRoles record);

    List<SystemRoles> selectByExample(SystemRolesExample example);

    SystemRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemRoles record, @Param("example") SystemRolesExample example);

    int updateByExample(@Param("record") SystemRoles record, @Param("example") SystemRolesExample example);

    int updateByPrimaryKeySelective(SystemRoles record);

    int updateByPrimaryKey(SystemRoles record);
}