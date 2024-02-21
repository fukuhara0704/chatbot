package com.example.chatbot.Form;

import lombok.Data;

@Data
public class AnswerForm {
    public boolean answer;
    public String answerContext;
    public Integer phaseType;
    public Integer questionNum;
    public Integer nextQuestionNum;
}
