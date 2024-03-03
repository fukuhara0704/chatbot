package com.example.chatbot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPhasesMapper;
import com.example.chatbot.mapper.PhaseMapper;
import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.Phase;
import com.example.chatbot.service.ExploreService;

@Service
public class ExploreServiceImpl implements ExploreService{

    @Autowired
    private PhaseMapper phaseMapper;

    @Autowired
    private ExplorationPhasesMapper explorationPhasesMapper;

    @Override
    public List<Phase> getPhases() {
        return phaseMapper.selectByExample(null);
    }

    @Override
    public ExplorationPhases getExplorationPhase(int phaseId) {
        return explorationPhasesMapper.selectByPrimaryKey(phaseId);
    }
}