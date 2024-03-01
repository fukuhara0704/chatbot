package com.example.chatbot.mapper;

import com.example.chatbot.model.Phase;
import com.example.chatbot.model.PhaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhaseMapper {
    long countByExample(PhaseExample example);

    int deleteByExample(PhaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Phase row);

    int insertSelective(Phase row);

    List<Phase> selectByExample(PhaseExample example);

    Phase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Phase row, @Param("example") PhaseExample example);

    int updateByExample(@Param("row") Phase row, @Param("example") PhaseExample example);

    int updateByPrimaryKeySelective(Phase row);

    int updateByPrimaryKey(Phase row);
}