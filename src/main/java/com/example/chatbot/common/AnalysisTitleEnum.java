package com.example.chatbot.common;

public enum AnalysisTitleEnum {

    PR1_1("PR1 問題未設定状態①", 1),
    PR1_2("PR1 問題未設定状態②", 2),
    PR1_3("PR1 問題未設定状態③", 3),
    PR2_1("PR2 問題発見状態①", 4),
    PR2_2("PR2 問題発見状態②", 5),
    PR2_3("PR2 問題発見状態③", 6),
    PR3_1("PR3 問い状態①", 7),
    PR4_1("PR4 仮説状態①", 8),
    PR5_1("PR5 目的変数設定状態①", 9),
    PR6_1("PR6 解決策提案準備状態①", 10),
    PR7_1("PR7 解決策の提案可能状態①", 11);

    private String label;
    private int id;


    private AnalysisTitleEnum(String label, int id) {
        this.label = label;
        this.id = id;
    }


    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }

    /**
     * 値を取得
     * @param id
     * @return
     */
    public static String getVauleById(int id) {

        for( AnalysisTitleEnum e : AnalysisTitleEnum.values() ) { //拡張for文による走査
            if( e.getId() == id ) {
                return e.label;                 //条件に一致するインスタンスを返す
            }
        }
        return null;
    }
}
