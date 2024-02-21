package com.example.chatbot.Form;

import lombok.Data;

@Data
public class AnswerForm {
    public boolean answer;
    public String answerContext;
    public String phaseType;
    public Integer id;
}
