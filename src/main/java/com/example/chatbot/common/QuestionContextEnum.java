package com.example.chatbot.common;

public enum QuestionContextEnum {

    PR1("現実状態調査は完了しています。 次，問題発見を行うように 助言してください。", 4),
    PR2("現実調査と理想状態のギャップを 問題と捉えましょう。 問題に対する問いを立てるように 助言してください。" , 7),
    PR7("今回の探究学習で実施する課題を 設定することができています。 次のフェーズに進むように 助言してください。" ,12),
    PL3("今回の探究学習が実行可能で あることを確認できています。 次のフェーズに進むように 助言してください。" ,15),
    D2("今回の探究学習の データ収集状態が達成できている ことが確認できました。 次のフェーズに進むように 助言してください。 " ,17),
    C1("今回の探究学習の データ分析状態が達成できている ことが確認できました。 次のフェーズに進むように 助言してください。" ,18),
    C3("今回の探究学習は終了です。 次は，発表するための 準備をしてください。" ,20);

    private String label;
    private int id;


    private QuestionContextEnum(String label, int id) {
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

        for( QuestionContextEnum e : QuestionContextEnum.values() ) { //拡張for文による走査
            if( e.getId() == id ) {
                return e.label;
            }
        }
        return null;
    }
}
