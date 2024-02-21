package com.example.chatbot.model;

import lombok.Data;

@Data
public class Question {

    public int id;
    public String title;
    public String question;
    public String answer;
    public String nextQuestionContext;

}
