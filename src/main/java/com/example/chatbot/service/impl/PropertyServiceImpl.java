package com.example.chatbot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPropertyMapper;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private ExplorationPropertyMapper explorationPropertyMapper;

    @Override
    public ExplorationProperty getExplorationProperty(Integer nextPropertyId) {
        return explorationPropertyMapper.selectByPrimaryKey(nextPropertyId);
    }

}
