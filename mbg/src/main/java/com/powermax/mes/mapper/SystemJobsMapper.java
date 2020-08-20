package com.powermax.mes.mapper;

import com.powermax.mes.model.SystemJobs;
import com.powermax.mes.model.SystemJobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemJobsMapper {
    long countByExample(SystemJobsExample example);

    int deleteByExample(SystemJobsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemJobs record);

    int insertSelective(SystemJobs record);

    List<SystemJobs> selectByExample(SystemJobsExample example);

    SystemJobs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemJobs record, @Param("example") SystemJobsExample example);

    int updateByExample(@Param("record") SystemJobs record, @Param("example") SystemJobsExample example);

    int updateByPrimaryKeySelective(SystemJobs record);

    int updateByPrimaryKey(SystemJobs record);
}