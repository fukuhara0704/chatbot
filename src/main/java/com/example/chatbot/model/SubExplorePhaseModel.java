package com.example.chatbot.model;

import java.util.List;

import lombok.Data;

/*
 * モデルクラス
 */
@Data
public class SubExplorePhaseModel {

    public String title;
    public String question;
    public String type;
    public List<String> questions;
}
