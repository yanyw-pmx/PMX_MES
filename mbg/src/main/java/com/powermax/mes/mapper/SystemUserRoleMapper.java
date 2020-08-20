package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemUserRole;
import com.powermax.mes.model.SystemUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserRoleMapper {
    long countByExample(SystemUserRoleExample example);

    int deleteByExample(SystemUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemUserRole record);

    int insertSelective(SystemUserRole record);

    List<SystemUserRole> selectByExample(SystemUserRoleExample example);

    SystemUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemUserRole record, @Param("example") SystemUserRoleExample example);

    int updateByExample(@Param("record") SystemUserRole record, @Param("example") SystemUserRoleExample example);

    int updateByPrimaryKeySelective(SystemUserRole record);

    int updateByPrimaryKey(SystemUserRole record);
}