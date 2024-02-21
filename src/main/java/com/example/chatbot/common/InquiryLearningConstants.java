package com.example.chatbot.common;
import java.util.ArrayList;
import java.util.List;

public class InquiryLearningConstants {

    // プロジェクトの状態
    public static final String PR1_NO_ISSUE = "Pr1問題未設定状態";
    public static final String PR2_ISSUE_FOUND = "Pr2問題発見状態";
    public static final String PR3_QUESTION = "Pr3問い状態";
    public static final String PR4_HYPOTHESIS = "Pr4仮説状態";
    public static final String PR5_TARGET_VARIABLE_SET = "Pr5目的変数設定状態";
    public static final String PR6_SOLUTION_PROPOSAL_PREPARATION = "Pr6解決策提案準備状態";
    public static final String PR7_SOLUTION_PROPOSAL_POSSIBLE = "Pr7解決策の提案可能状態";

    // Pr1問題未設定状態の質問
    public static final String PR1_QUESTION_1 = "設定したテーマに関する 現実状態に対する データ取得を行いましたか？";
    public static final String PR1_QUESTION_2 = "現実状態に対する取得したデータの データ分析を行いましたか";
    public static final String PR1_QUESTION_3 = "現実状態に対するデータ分析から 考察を行いましたか？";
    public static final String PR1_QUESTION_CONTEXT = "現実状態調査は完了しています。 次，問題発見を行うように 助言してください。";
    public static List<String> PR1_QUESTIONS = new ArrayList<String>() {{
            add(PR1_QUESTION_1);
            add(PR1_QUESTION_2);
            add(PR1_QUESTION_3);
        }};

    // Pr1問題未設定状態の回答
    public static final String PR1_ANSWER_1 = "現実状態に対する データ取得を行うように 助言してください。";
    public static final String PR1_ANSWER_2 = "現実状態に対する データ分析を行うように 助言してください。";
    public static final String PR1_ANSWER_3 = "現実状態に対する 考察を行うように 助言してください。";
    public static List<String> PR1_ANSWERS = new ArrayList<String>() {{
            add(PR1_ANSWER_1);
            add(PR1_ANSWER_2);
            add(PR1_ANSWER_3);
        }};

    // Pr2問題発見状態の質問
    public static final String PR2_QUESTION_1 = "現実状態の調査は 実施していますか？";
    public static final String PR2_QUESTION_2 = "理想状態は考えていますか？";
    public static final String PR2_QUESTION_3 = "現実状態と理想状態の ギャップを考えていますか？";
    public static final String PR2_QUESTION_CONTEXT = "現実調査と理想状態のギャップを 問題と捉えましょう。 問題に対する問いを立てるように 助言してください。";
    public static List<String> PR2_QUESTIONS = new ArrayList<String>() {{
            add(PR2_QUESTION_1);
            add(PR2_QUESTION_2);
            add(PR2_QUESTION_3);
        }};

    // Pr2問題発見状態の回答
    public static final String PR2_ANSWER_1 = "現実状態の調査を 実施するように 助言してください。";
    public static final String PR2_ANSWER_2 = "理想状態を 考えるように 助言してください。";
    public static final String PR2_ANSWER_3 = "現実状態と理想状態の ギャップを考えるように 助言してください。";
    public static List<String> PR2_ANSWERS = new ArrayList<String>() {{
            add(PR2_ANSWER_1);
            add(PR2_ANSWER_2);
            add(PR2_ANSWER_3);
        }};
    // Pr3問い状態の質問
    public static final String PR3_QUESTION_1 = "問いを立てることが できていますか？";
    public static List<String> PR3_QUESTIONS = new ArrayList<String>() {{
            add(PR3_QUESTION_1);
        }};
    // Pr3問い状態の回答
    public static final String PR3_ANSWER_1 = "問いを立てるように 助言してください。";
    public static List<String> PR3_ANSWERS = new ArrayList<String>() {{
            add(PR3_ANSWER_1);
        }};

    // Pr4仮説状態の質問
    public static final String PR4_QUESTION_1 = "問いに対する予想する 解を考えていますか？";
    public static List<String> PR4_QUESTIONS = new ArrayList<String>() {{
            add(PR4_QUESTION_1);
        }};
    // Pr4仮説状態の回答
    public static final String PR4_ANSWER_1 = "問いに対する予想する 解を考えるように 助言してください。";
    public static List<String> PR4_ANSWERS = new ArrayList<String>() {{
            add(PR4_ANSWER_1);
        }};

    // Pr5目的変数設定状態の質問
    public static final String PR5_QUESTION_1 = "予想した解に該当する情報を 目的変数と呼ぶことにします。 どのような目的変数に該当する 情報収集を行うを決めましたか？";
    public static List<String> PR5_QUESTIONS = new ArrayList<String>() {{
            add(PR5_QUESTION_1);
        }};
    // Pr5目的変数設定状態の回答
    public static final String PR5_ANSWER_1 = "予想した解に該当する 収集する情報を決めるように 助言してください。";
    public static List<String> PR5_ANSWERS = new ArrayList<String>() {{
            add(PR5_ANSWER_1);
        }};

    // Pr6解決策提案準備状態の質問
    public static final String PR6_QUESTION_1 = "目的変数に影響を与える情報は どのような情報があるのか 考えていますか？ 目的変数に影響を与える情報を説明 変数と呼ぶことにします。";
    public static List<String> PR6_QUESTIONS = new ArrayList<String>() {{
            add(PR6_QUESTION_1);
        }};
    // Pr6解決策提案準備状態の回答
    public static final String PR6_ANSWER_1 = "目的変数に影響を与える情報を， 考えられる情報を複数あげるように 助言してください。";
    public static List<String> PR6_ANSWERS = new ArrayList<String>() {{
            add(PR6_ANSWER_1);
        }};

    // Pr7解決策の提案可能状態の質問
    public static final String PR7_QUESTION_1 = "今回の探究学習で収集する 説明変数は決定していますか？";
    public static final String PR7_QUESTION_CONTEXT = "今回の探究学習で実施する課題を 設定することができています。 次のフェーズに進むように 助言してください。";
    public static List<String> PR7_QUESTIONS = new ArrayList<String>() {{
            add(PR7_QUESTION_1);
        }};
    // Pr7解決策の提案可能状態の回答
    public static final String PR7_ANSWER_1 = "今回の探究学習で収集する 説明変数を決定するように 助言してください。";
    public static List<String> PR7_ANSWERS = new ArrayList<String>() {{
            add(PR7_ANSWER_1);
        }};


    // Planフェーズの状態
    public static final String PL1_EXECUTION_UNKNOWN = "Pl1実行不明状態";
    public static final String PL2_ENVIRONMENTAL_FACTOR_POSSIBLE = "Pl2環境要因可能状態";
    public static final String PL3_EXECUTION_POSSIBLE = "Pl3実行可能状態";

    // Dataフェーズの状態
    public static final String D1_DATA_NOT_ACQUIRED = "D1データ未取得状態";
    public static final String D2_DATA_ACQUIRED = "D2データ取得状態";
    public static final String D3_EXECUTION_POSSIBLE = "D3実行可能状態";

    // Analysisフェーズの状態
    public static final String A1_NOT_ANALYZED = "A1未分析状態";
    public static final String A2_ANALYSIS_POSSIBLE = "A2分析可能状態";

    // Conclusionフェーズの状態
    public static final String C1_NOT_EXPRESSED = "C1未言語化状態";
    public static final String C2_RESULTS_WRITTEN = "C2結果記載状態";
    public static final String C3_REFLECTION = "C3考察状態";

}



