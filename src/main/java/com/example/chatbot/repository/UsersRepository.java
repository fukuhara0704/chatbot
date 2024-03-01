package com.example.chatbot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.chatbot.mapper.UsersMapper;
import com.example.chatbot.model.Users;
import com.example.chatbot.model.UsersExample;

@Repository
public class UsersRepository{

    @Autowired
    private UsersMapper usersMapper;

    public long countByExample(UsersExample example) {
        return usersMapper.countByExample(example);
    }

    public int deleteByExample(UsersExample example) {
        return usersMapper.deleteByExample(example);
    }

    public int insert(Users row) {
        return usersMapper.insert(row);
    }

    public int insertSelective(Users row) {
        return usersMapper.insertSelective(row);
    }

    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    public int updateByExampleSelective(Users row, UsersExample example) {
        return usersMapper.updateByExampleSelective(row, example);
    }

    public int updateByExample(Users row, UsersExample example) {
        return usersMapper.updateByExample(row, example);
    }
    
}
