package com.powermax.mes.mapper;

import com.powermax.mes.model.ProduceProcessPiece;
import com.powermax.mes.model.ProduceProcessPieceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceProcessPieceMapper {
    long countByExample(ProduceProcessPieceExample example);

    int deleteByExample(ProduceProcessPieceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProduceProcessPiece record);

    int insertSelective(ProduceProcessPiece record);

    List<ProduceProcessPiece> selectByExample(ProduceProcessPieceExample example);

    ProduceProcessPiece selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProduceProcessPiece record, @Param("example") ProduceProcessPieceExample example);

    int updateByExample(@Param("record") ProduceProcessPiece record, @Param("example") ProduceProcessPieceExample example);

    int updateByPrimaryKeySelective(ProduceProcessPiece record);

    int updateByPrimaryKey(ProduceProcessPiece record);
}