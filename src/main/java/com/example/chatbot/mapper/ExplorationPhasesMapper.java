package com.example.chatbot.mapper;

import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.ExplorationPhasesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExplorationPhasesMapper {
    long countByExample(ExplorationPhasesExample example);

    int deleteByExample(ExplorationPhasesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExplorationPhases row);

    int insertSelective(ExplorationPhases row);

    List<ExplorationPhases> selectByExample(ExplorationPhasesExample example);

    ExplorationPhases selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ExplorationPhases row, @Param("example") ExplorationPhasesExample example);

    int updateByExample(@Param("row") ExplorationPhases row, @Param("example") ExplorationPhasesExample example);

    int updateByPrimaryKeySelective(ExplorationPhases row);

    int updateByPrimaryKey(ExplorationPhases row);
}