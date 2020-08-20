package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemOrg;
import com.powermax.mes.model.SystemOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemOrgMapper {
    long countByExample(SystemOrgExample example);

    int deleteByExample(SystemOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemOrg record);

    int insertSelective(SystemOrg record);

    List<SystemOrg> selectByExample(SystemOrgExample example);

    SystemOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemOrg record, @Param("example") SystemOrgExample example);

    int updateByExample(@Param("record") SystemOrg record, @Param("example") SystemOrgExample example);

    int updateByPrimaryKeySelective(SystemOrg record);

    int updateByPrimaryKey(SystemOrg record);
}