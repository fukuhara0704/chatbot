package com.example.chatbot.common;

public enum ProblemQuestionEnum {

    PR1_1("設定したテーマに関する 現実状態に対する データ取得を行いましたか？", 1),
    PR1_2("現実状態に対する取得したデータの データ分析を行いましたか", 2),
    PR1_3("現実状態に対するデータ分析から 考察を行いましたか？", 3),
    PR2_1("現実状態の調査は 実施していますか？", 4),
    PR2_2("理想状態は考えていますか？", 5),
    PR2_3("現実状態と理想状態の ギャップを考えていますか？", 6),
    PR3_1("問いを立てることが できていますか？", 7),
    PR4_1("問いに対する予想する 解を考えていますか？", 8),
    PR5_1("予想した解に該当する情報を 目的変数と呼ぶことにします。 どのような目的変数に該当する 情報収集を行うを決めましたか？", 9),
    PR6_1("目的変数に影響を与える情報は どのような情報があるのか 考えていますか？ 目的変数に影響を与える情報を説明 変数と呼ぶことにします。", 10),
    PR7_1("今回の探究学習で収集する 説明変数は決定していますか？", 11);

    private String label;
    private int id;


    private ProblemQuestionEnum(String label, int id) {
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

        for( ProblemQuestionEnum e : ProblemQuestionEnum.values() ) { //拡張for文による走査
            if( e.getId() == id ) {
                return e.label;                 //条件に一致するインスタンスを返す
            }
        }
        return null;
    }
}
