package com.example.chatbot.mapper;

import com.example.chatbot.model.SubPhases;
import com.example.chatbot.model.SubPhasesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubPhasesMapper {
    long countByExample(SubPhasesExample example);

    int deleteByExample(SubPhasesExample example);

    int deleteByPrimaryKey(Integer subPhaseId);

    int insert(SubPhases row);

    int insertSelective(SubPhases row);

    List<SubPhases> selectByExample(SubPhasesExample example);

    SubPhases selectByPrimaryKey(Integer subPhaseId);

    int updateByExampleSelective(@Param("row") SubPhases row, @Param("example") SubPhasesExample example);

    int updateByExample(@Param("row") SubPhases row, @Param("example") SubPhasesExample example);

    int updateByPrimaryKeySelective(SubPhases row);

    int updateByPrimaryKey(SubPhases row);
}