package com.example.chatbot.service;

import com.example.chatbot.model.ExplorationProperty;

public interface PropertyService {

    ExplorationProperty getExplorationProperty(Integer nextPropertyId);

    void save(String userName, Integer nextPropertyId);
}
