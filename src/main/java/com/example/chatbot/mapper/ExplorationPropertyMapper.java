package com.example.chatbot.mapper;

import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.model.ExplorationPropertyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExplorationPropertyMapper {
    long countByExample(ExplorationPropertyExample example);

    int deleteByExample(ExplorationPropertyExample example);

    int deleteByPrimaryKey(Integer propertyId);

    int insert(ExplorationProperty row);

    int insertSelective(ExplorationProperty row);

    List<ExplorationProperty> selectByExample(ExplorationPropertyExample example);

    ExplorationProperty selectByPrimaryKey(Integer propertyId);

    int updateByExampleSelective(@Param("row") ExplorationProperty row, @Param("example") ExplorationPropertyExample example);

    int updateByExample(@Param("row") ExplorationProperty row, @Param("example") ExplorationPropertyExample example);

    int updateByPrimaryKeySelective(ExplorationProperty row);

    int updateByPrimaryKey(ExplorationProperty row);
}