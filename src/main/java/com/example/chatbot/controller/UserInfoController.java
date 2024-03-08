package com.example.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatbot.model.UserInfo;
import com.example.chatbot.service.UserInfoService;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/register")
    public String RegistrationForm(Model model) {
        model.addAttribute("userInfo", new UserInfo());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserInfo userInfo) {
        // ユーザの保存などの処理
        userInfoService.save(userInfo);
        return "redirect:/login"; // 登録後にログインページにリダイレクト
    }

}
