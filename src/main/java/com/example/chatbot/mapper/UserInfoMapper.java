package com.example.chatbot.mapper;

import com.example.chatbot.model.MyUser;
import com.example.chatbot.model.UserInfo;
import com.example.chatbot.model.UserInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {

    MyUser findByUsername(String username);

    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(UserInfo row);

    int insertSelective(UserInfo row);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("row") UserInfo row, @Param("example") UserInfoExample example);

    int updateByExample(@Param("row") UserInfo row, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo row);

    int updateByPrimaryKey(UserInfo row);
}