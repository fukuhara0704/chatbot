package com.example.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.chatbot.model.UserHistory;
import com.example.chatbot.model.UserResponses;
import com.example.chatbot.service.HistoryService;

import java.util.List;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;
    
    @GetMapping("/history")
    public String history(Authentication loginUser, Model model) {

        String userName = loginUser.getName();
        List<UserResponses> userResponses =  historyService.getUserResponses(userName);

        List<UserHistory> userHistories = historyService.getHistroy(userResponses);

        model.addAttribute("userHistories", userHistories);
        model.addAttribute("userName", loginUser.getName());
        return "history";
    }
}
