package com.example.chatbot.common;

public enum StateEnum {
    PR1(1, "PR1 問題未設定状態"),
    PR2(2, "PR2 問題発見状態"),
    PR3(3, "PR3 問い状態"),
    PR4(4, "PR4 仮説状態"),
    PR5(5, "PR5 目的変数設定状態"),
    PR6(6, "PR6 解決策提案準備状態"),
    PR7(7, "PR7 解決策の提案可能状態"),

    Pl1(8,"Pl1 実行不明状態"),
    Pl2(9,"Pl2 環境要因可能状態"),
    Pl3(10,"Pl3 実行可能状態"),

    D1(11, "D1 データ未取得状態"),
    D2(12, "D2 データ取得状態"),
    D3(13, "D3 実行可能状態"),

    A1(14, "A1 未分析状態"),
    A2(15, "A2 分析可能状態"),

    C1(16, "C1 未言語化状態"),
    C2(17, "C2 結果記載状態"),
    C3(18, "C3 考察状態");



    private final int code;
    private final String description;

    StateEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
