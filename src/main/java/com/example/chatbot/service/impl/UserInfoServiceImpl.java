package com.example.chatbot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.chatbot.mapper.UserInfoMapper;
import com.example.chatbot.model.UserInfo;
import com.example.chatbot.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
	public void save(UserInfo userInfo) {
        String encodedPassword = encodePassword(userInfo.getPassword());

        System.out.println("Raw Password: " + userInfo.getPassword());
        System.out.println("Encoded Password: " + encodedPassword);

        // パスワードの照合
        boolean matches = checkPassword("your_raw_password", encodedPassword);
        System.out.println("Password Matches: " + matches);

        userInfo.setPassword(encodedPassword);
        userInfoMapper.insert(userInfo);
	}

    private static String encodePassword(String rawPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(rawPassword);
    }

    private static boolean checkPassword(String rawPassword, String encodedPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
