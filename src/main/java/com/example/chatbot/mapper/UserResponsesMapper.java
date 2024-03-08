package com.example.chatbot.mapper;

import com.example.chatbot.model.UserResponses;
import com.example.chatbot.model.UserResponsesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserResponsesMapper {
    long countByExample(UserResponsesExample example);

    int deleteByExample(UserResponsesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserResponses row);

    int insertSelective(UserResponses row);

    List<UserResponses> selectByExample(UserResponsesExample example);

    UserResponses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UserResponses row, @Param("example") UserResponsesExample example);

    int updateByExample(@Param("row") UserResponses row, @Param("example") UserResponsesExample example);

    int updateByPrimaryKeySelective(UserResponses row);

    int updateByPrimaryKey(UserResponses row);
}