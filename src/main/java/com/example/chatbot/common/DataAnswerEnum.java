package com.example.chatbot.common;

public enum DataAnswerEnum {

    PR1_1("現実状態に対する データ取得を行うように 助言してください。" , 1),
    PR1_2("現実状態に対する データ分析を行うように 助言してください。" , 2),
    PR1_3("現実状態に対する 考察を行うように 助言してください。" , 3),
    PR2_1("現実状態の調査を 実施するように 助言してください。" , 4),
    PR2_2("理想状態を 考えるように 助言してください。" , 5),
    PR2_3("現実状態と理想状態の ギャップを考えるように 助言してください。" , 6),
    PR3_1("問いを立てるように 助言してください。" , 7),
    PR4_1("問いに対する予想する 解を考えるように 助言してください。" , 8),
    PR5_1("予想した解に該当する 収集する情報を決めるように 助言してください。" , 9),
    PR6_1("目的変数に影響を与える情報を， 考えられる情報を複数あげるように 助言してください。" , 10),
    PR7_1("今回の探究学習で収集する 説明変数を決定するように 助言してください。" , 11);

    private String label;
    private int id;


    private DataAnswerEnum(String label, int id) {
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

        for( DataAnswerEnum e : DataAnswerEnum.values() ) { //拡張for文による走査
            if( e.getId() == id ) {
                return e.label;
            }
        }
        return null;
    }
}
