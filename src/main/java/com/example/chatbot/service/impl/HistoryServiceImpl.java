package com.example.chatbot.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.ExplorationPropertyMapper;
import com.example.chatbot.mapper.UserResponsesMapper;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.model.ExplorationPropertyExample;
import com.example.chatbot.model.JsonContainer;
import com.example.chatbot.model.PropertyResult;
import com.example.chatbot.model.PropertyStatus;
import com.example.chatbot.model.UserHistory;
import com.example.chatbot.model.UserResponses;
import com.example.chatbot.model.UserResponsesExample;
import com.example.chatbot.service.HistoryService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private UserResponsesMapper userResponsesMapper;

    @Autowired
    ExplorationPropertyMapper explorationPropertyMapper;

    /**
     * json作成
     * @param nextPropertyId
     * @param explorationProperties 
     * @return
     * @throws JsonProcessingException 
     */
    private String createAnswerJson(Integer nextPropertyId, List<ExplorationProperty> explorationProperties) throws JsonProcessingException {
        // データを持つクラスのリストを作成
        List<PropertyResult> data = new ArrayList<>();
        if(nextPropertyId == null){
            for (ExplorationProperty explorationProperty : explorationProperties) {
                PropertyResult propertyResult = new PropertyResult(explorationProperty.getPropertyId(), "true");
                data.add(propertyResult);
            }
        }else{
            for (ExplorationProperty explorationProperty : explorationProperties) {
                if(nextPropertyId > explorationProperty.getPropertyId()){
                    PropertyResult propertyResult = new PropertyResult(explorationProperty.getPropertyId(), "true");
                    data.add(propertyResult);
                }else{
                    PropertyResult propertyResult = new PropertyResult(explorationProperty.getPropertyId(), "false");
                    data.add(propertyResult);
                }
            }
        }
        // JSONオブジェクトを構築
        JsonContainer jsonContainer = new JsonContainer();
        jsonContainer.setData(data);

        // Jackson ObjectMapperを使用してJSONに変換
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String AnswerJson = objectMapper.writeValueAsString(jsonContainer);

        System.out.println(AnswerJson);

        return AnswerJson;
    }


    @Override
    public List<UserHistory> getHistroy(List<UserResponses> userResponses) {
        List<UserHistory> results = new ArrayList<>();

        ExplorationPropertyExample explorationPropertyExample = new ExplorationPropertyExample();
        explorationPropertyExample.createCriteria().andPropertyAnswerIsNotNull();
        List<ExplorationProperty> explorationProperties = explorationPropertyMapper.selectByExample(explorationPropertyExample);


        for (UserResponses userRespons : userResponses) {
            Integer lastAnswerBeforeId;
            if(userRespons.getLastAnswerId() == null){
                lastAnswerBeforeId = null;
            }else{
                lastAnswerBeforeId = userRespons.getLastAnswerId() -1;
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
                if(lastAnswerBeforeId == null){

                    propertyStatus.setStatus(true);
                    if(explorationProperty.getNextPropertyId() == null){
                        data.setLastQuestion(explorationProperty.getPropertyQuestion());
                        data.setLastAnswer(explorationProperty.getPropertyAnswer());
                    }
                }else{
                    if(userRespons.getLastAnswerId() > explorationProperty.getPropertyId()){
                        propertyStatus.setStatus(true);
                    }else{
                        propertyStatus.setStatus(false);
                    }
                    if(lastAnswerBeforeId.equals(explorationProperty.getPropertyId())){
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
