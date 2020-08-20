package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemAdmin;
import com.powermax.mes.model.SystemAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdminMapper {
    long countByExample(SystemAdminExample example);

    int deleteByExample(SystemAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemAdmin record);

    int insertSelective(SystemAdmin record);

    List<SystemAdmin> selectByExample(SystemAdminExample example);

    SystemAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemAdmin record, @Param("example") SystemAdminExample example);

    int updateByExample(@Param("record") SystemAdmin record, @Param("example") SystemAdminExample example);

    int updateByPrimaryKeySelective(SystemAdmin record);

    int updateByPrimaryKey(SystemAdmin record);
}