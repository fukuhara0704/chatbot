package com.example.chatbot.model;

import lombok.Data;

@Data
public class QuestionState {

    // 状態のタイプ(Pr1,Pl1,D1,A1,C1など)
    public String type;

    // 質問番号
    public int questionNum;

    // 質問
    public String question;

    // 答え
    public String answer;

    // 次の状態のタイプ(Pr1,Pl1,D1,A1,C1など)
    public String nextType;
}
