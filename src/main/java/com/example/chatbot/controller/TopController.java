package com.example.chatbot.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
    @GetMapping("/top")
    public String history(Authentication loginUser) {
        return "top";
    }
}
