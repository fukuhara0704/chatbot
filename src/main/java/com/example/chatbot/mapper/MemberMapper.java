package com.example.chatbot.mapper;

import com.example.chatbot.model.Member;
import com.example.chatbot.model.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String mailAddress);

    int insert(Member row);

    int insertSelective(Member row);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(String mailAddress);

    int updateByExampleSelective(@Param("row") Member row, @Param("example") MemberExample example);

    int updateByExample(@Param("row") Member row, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member row);

    int updateByPrimaryKey(Member row);
}