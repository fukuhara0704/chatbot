package com.example.chatbot.service;

import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.Phase;
import java.util.List;


public interface ExploreService {

    List<Phase> getPhases();
    ExplorationPhases getExplorationPhase();
}
