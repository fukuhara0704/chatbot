package com.example.chatbot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPropertyMapper;
import com.example.chatbot.mapper.UserResponsesMapper;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.model.UserResponses;
import com.example.chatbot.service.PropertyService;
import java.util.Date;


@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private ExplorationPropertyMapper explorationPropertyMapper;
    @Autowired
    private UserResponsesMapper userResponsesMapper;;

    @Override
    public ExplorationProperty getExplorationProperty(Integer nextPropertyId) {
        return explorationPropertyMapper.selectByPrimaryKey(nextPropertyId);
    }

    @Override
    public void save(String userName, Integer nextPropertyId) {
        // 現在の日付をフォーマット
        Date today = new Date();
        System.out.println("現在の日付 (Date型): " + today);

        UserResponses userResponses = new UserResponses();
        userResponses.setUsername(userName);
        userResponses.setRegistrationDate(today);
        userResponses.setLastAnswerId(nextPropertyId);
        userResponsesMapper.insert(userResponses);

    }

}
