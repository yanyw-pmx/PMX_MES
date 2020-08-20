package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemAdminGroups;
import com.powermax.mes.model.SystemAdminGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdminGroupsMapper {
    long countByExample(SystemAdminGroupsExample example);

    int deleteByExample(SystemAdminGroupsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemAdminGroups record);

    int insertSelective(SystemAdminGroups record);

    List<SystemAdminGroups> selectByExample(SystemAdminGroupsExample example);

    SystemAdminGroups selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemAdminGroups record, @Param("example") SystemAdminGroupsExample example);

    int updateByExample(@Param("record") SystemAdminGroups record, @Param("example") SystemAdminGroupsExample example);

    int updateByPrimaryKeySelective(SystemAdminGroups record);

    int updateByPrimaryKey(SystemAdminGroups record);
}