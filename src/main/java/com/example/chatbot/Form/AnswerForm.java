package com.example.chatbot.Form;

import lombok.Data;

@Data
public class AnswerForm {
    public boolean answer;
    public String propertyAnswer;
    public String nextContext;
    public Integer nextPropertyId;
}
