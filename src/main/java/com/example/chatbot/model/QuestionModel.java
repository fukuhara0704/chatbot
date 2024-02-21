package com.example.chatbot.model;

import lombok.Data;

@Data
public class QuestionModel {
    public String answerContext;

    public String questionTitle;
    public String question;
    public Integer questionNum;
    public Integer nextQuestionNum;
    public String answer;
    public Integer phaseType;
}
