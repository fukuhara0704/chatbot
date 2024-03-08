package com.example.chatbot.model;

import lombok.Data;
import java.util.List;

@Data
public class UserHistory {

    public Integer id;
    public String registDate;
    public String lastQuestion;
    public String lastAnswer;
    List<PropertyStatus> questions;
}
