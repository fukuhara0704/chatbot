package com.example.chatbot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.chatbot.mapper.ExplorationPhasesMapper;
import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.ExplorationPhasesExample;

@Repository
public class ExplorationPhasesRepository{
    @Autowired
    private ExplorationPhasesMapper explorationPhasesMapper;

    public long countByExample(ExplorationPhasesExample example) {
        return explorationPhasesMapper.countByExample(example);
    }

    public int deleteByExample(ExplorationPhasesExample example) {
        return explorationPhasesMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return explorationPhasesMapper.deleteByPrimaryKey(id);
    }

    public int insert(ExplorationPhases row) {
        return explorationPhasesMapper.insert(row);
    }

    public int insertSelective(ExplorationPhases row) {
        return explorationPhasesMapper.insertSelective(row);
    }

    public List<ExplorationPhases> selectByExample(ExplorationPhasesExample example) {
        return explorationPhasesMapper.selectByExample(example);
    }

    public ExplorationPhases selectByPrimaryKey(Integer id) {
        return explorationPhasesMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(ExplorationPhases row, ExplorationPhasesExample example) {
        return explorationPhasesMapper.updateByExampleSelective(row, example);
    }

    public int updateByExample(ExplorationPhases row, ExplorationPhasesExample example) {
        return explorationPhasesMapper.updateByExample(row, example);
    }

    public int updateByPrimaryKeySelective(ExplorationPhases row) {
        return explorationPhasesMapper.updateByPrimaryKeySelective(row);
    }

    public int updateByPrimaryKey(ExplorationPhases row) {
        return explorationPhasesMapper.updateByPrimaryKey(row);
    }

}
