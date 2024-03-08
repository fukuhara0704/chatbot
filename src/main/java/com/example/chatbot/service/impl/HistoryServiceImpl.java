package com.example.chatbot.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPropertyMapper;
import com.example.chatbot.mapper.UserResponsesMapper;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.model.ExplorationPropertyExample;
import com.example.chatbot.model.PropertyStatus;
import com.example.chatbot.model.UserHistory;
import com.example.chatbot.model.UserResponses;
import com.example.chatbot.model.UserResponsesExample;
import com.example.chatbot.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private UserResponsesMapper userResponsesMapper;

    @Autowired
    ExplorationPropertyMapper explorationPropertyMapper;

    @Override
    public List<UserHistory> getHistroy(List<UserResponses> userResponses) {
        List<UserHistory> results = new ArrayList<>();

        ExplorationPropertyExample explorationPropertyExample = new ExplorationPropertyExample();
        explorationPropertyExample.createCriteria().andPropertyAnswerIsNotNull();
        List<ExplorationProperty> explorationProperties = explorationPropertyMapper
                .selectByExample(explorationPropertyExample);

        for (UserResponses userRespons : userResponses) {
            Integer lastAnswerBeforeId;
            if (userRespons.getLastAnswerId() == null) {
                lastAnswerBeforeId = null;
            } else {
                lastAnswerBeforeId = userRespons.getLastAnswerId() - 1;
            }

            UserHistory data = new UserHistory();
            data.setId(userRespons.getId());
            // フォーマットを指定してSimpleDateFormatオブジェクトを作成
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            // フォーマットに従って日時を文字列に変換
            String registDate = dateFormat.format(userRespons.getRegistrationDate());
            data.setRegistDate(registDate);
            List<PropertyStatus> propertyStatusList = new ArrayList<>();
            for (ExplorationProperty explorationProperty : explorationProperties) {
                PropertyStatus propertyStatus = new PropertyStatus();
                propertyStatus.setQuestion(explorationProperty.getPropertyQuestion());
                if (lastAnswerBeforeId == null) {

                    propertyStatus.setStatus(true);
                    if (explorationProperty.getNextPropertyId() == null) {
                        data.setLastQuestion(explorationProperty.getPropertyQuestion());
                        data.setLastAnswer(explorationProperty.getPropertyAnswer());
                    }
                } else {
                    if (userRespons.getLastAnswerId() > explorationProperty.getPropertyId()) {
                        propertyStatus.setStatus(true);
                    } else {
                        propertyStatus.setStatus(false);
                    }
                    if (lastAnswerBeforeId.equals(explorationProperty.getPropertyId())) {
                        data.setLastQuestion(explorationProperty.getPropertyQuestion());
                        data.setLastAnswer(explorationProperty.getPropertyAnswer());
                    }
                }
                propertyStatusList.add(propertyStatus);
            }
            data.setQuestions(propertyStatusList);
            results.add(data);
        }
        return results;
    }

    @Override
    public List<UserResponses> getUserResponses(String userName) {
        UserResponsesExample userResponsesExample = new UserResponsesExample();
        userResponsesExample.createCriteria().andUsernameEqualTo(userName);
        return userResponsesMapper.selectByExample(userResponsesExample);
    }
}
