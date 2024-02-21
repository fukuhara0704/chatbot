package com.example.chatbot.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * メインの探究フェーズの定数クラス
 */
public class MainExploreConstants {

    /* メインの探究フェーズのタイトル */
    public static final String MAIN_PHASE_TITLE = "現在の探究フェーズ";
    /* メインの探究フェーズの質問 */
    public static final String MAIN_PHASE_QUESTION = "生徒はどの探究フェーズであると判断していますか？";

    /* メインの探究フェーズのリスト */
    public static final List<String> MAIN_EXPLORE_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "①Problemフェーズ"
            , "②Planフェーズ"
            , "③Dataフェーズ"
            , "④Analysisフェーズ"
            , "⑤Conclusionフェーズ"
            )
        );


    /* サブの探究フェーズのタイトル */
    public static final String SUB_PHASE_TITLE = "困っているの探究フェーズ";
    /* サブの探究フェーズの質問 */
    public static final String SUB_PHASE_QUESTION = "生徒はどの探究状態で困っていると判断していますか？";

    /* ①Problemフェーズ */
    public static final String PROBLEM = "Pr";
    public static final List<String> PROBLEM_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "問題未設定状態"
            , "問題発見状態"
            , "問い状態"
            , "仮説状態"
            , "目的変数設定状態"
            , "解決策提案準備状態"
            , "解決策の提案可能状態"
            )
        );

    /* ②Planフェーズ */
    public static final String PLAN = "Pl";
    public static final List<String> PLAN_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "実行不明状態"
            , "環境要因可能状態"
            , "実行可能状態"
            )
        );

    /* ③Dataフェーズ */
    public static final String DATA = "D";
    public static final List<String> DATA_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "データ未取得状態"
            , "データ取得状態"
            , "実行可能状態"
            )
        );

    /* ④Analysisフェーズ */
    public static final String ANALYSIS = "A";
    public static final List<String> ANALYSIS_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "未分析状態"
            , "分析可能状態"
            )
        );

    /* ⑤Conclusionフェーズ */
    public static final String CONCLUSION  = "C";
    public static final List<String> CONCLUSION_PHASE_LIST = Collections.unmodifiableList(
        Arrays.asList(
            "未言語化状態"
            , "結果記載状態"
            , "考察状態"
            )
        );
}