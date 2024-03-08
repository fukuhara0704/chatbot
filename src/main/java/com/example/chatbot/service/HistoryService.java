package com.example.chatbot.service;

import java.util.List;

import com.example.chatbot.model.UserHistory;
import com.example.chatbot.model.UserResponses;

public interface HistoryService {
    List<UserHistory> getHistroy(List<UserResponses> userResponses);

    List<UserResponses> getUserResponses(String userName);

}
