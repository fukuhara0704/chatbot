package com.example.chatbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/login") //configのloginPageでloginに来るように指定したので
    public String login() {
        return "login";//自作のloginページを表示
    }

}
