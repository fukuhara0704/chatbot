package com.example.chatbot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPhasesMapper;
import com.example.chatbot.mapper.PhaseMapper;
import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.Phase;
import com.example.chatbot.repository.ExplorationPhasesRepository;
import com.example.chatbot.repository.PhaseRepository;
import com.example.chatbot.service.ExploreService;

@Service
public class ExploreServiceImpl implements ExploreService{

    @Autowired
    private PhaseRepository phaseRepository;

    @Autowired
    private ExplorationPhasesRepository explorationPhasesRepository;

    @Override
    public List<Phase> getPhases() {
        return phaseRepository.selectByExample(null);
    }

    @Override
    public ExplorationPhases getExplorationPhase() {
        return explorationPhasesRepository.selectByPrimaryKey(1);
    }
}