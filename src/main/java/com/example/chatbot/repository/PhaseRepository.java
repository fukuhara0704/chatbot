package com.example.chatbot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.chatbot.mapper.PhaseMapper;
import com.example.chatbot.model.Phase;
import com.example.chatbot.model.PhaseExample;

@Repository
public class PhaseRepository{

    @Autowired
    private PhaseMapper phaseMapper;

    public long countByExample(PhaseExample example) {
        return phaseMapper.countByExample(example);
    }

    public int deleteByExample(PhaseExample example) {
        return phaseMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return phaseMapper.deleteByPrimaryKey(id);
    }

    public int insert(Phase row) {
        return phaseMapper.insert(row);
    }

    public int insertSelective(Phase row) {
        return phaseMapper.insertSelective(row);
    }

    public List<Phase> selectByExample(PhaseExample example) {
        return phaseMapper.selectByExample(example);
    }

    public Phase selectByPrimaryKey(Integer id) {
        return phaseMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(Phase row, PhaseExample example) {
        return phaseMapper.updateByExampleSelective(row, example);
    }

    public int updateByExample(Phase row, PhaseExample example) {
        return phaseMapper.updateByExample(row, example);
    }

    public int updateByPrimaryKeySelective(Phase row) {
        return phaseMapper.updateByPrimaryKeySelective(row);
    }

    public int updateByPrimaryKey(Phase row) {
        return phaseMapper.updateByPrimaryKey(row);
    }

}
