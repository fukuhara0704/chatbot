package com.example.chatbot.model;

import java.util.List;

import lombok.Data;

@Data
public class NextInquiryModel {

    public String title;
    public String question;
    public String type;
    public List<String> questions;
}
