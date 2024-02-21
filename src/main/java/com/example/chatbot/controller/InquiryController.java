package com.example.chatbot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chatbot.Form.SelectedPhaseForm;
import com.example.chatbot.model.NextInquiryModel;

@Controller
public class InquiryController {
    @RequestMapping("/")
    public String showInquiryPage(Model model) {
        // フェーズの選択肢をModelに追加
        model.addAttribute("phases", new String[]{"①Problemフェーズ", "②Planフェーズ", "③Dataフェーズ", "④Analysisフェーズ", "⑤Conclusionフェーズ"});
        return "inquiry";
    }

    @PostMapping("/next")
    public String showInquiryNextPage(SelectedPhaseForm selectedPhaseForm, Model model) {
        String selectedPhase = selectedPhaseForm.getSelectedPhaseForm();
        
        NextInquiryModel nextInquiry = createNextInquiry(selectedPhase);

        model.addAttribute("nextInquiry", nextInquiry);
        return "next";
    }


    private NextInquiryModel createNextInquiry(String selectedPhase) {

        NextInquiryModel nextInquiry = new NextInquiryModel();
        nextInquiry.setTitle("困っているの探究フェーズ");
        nextInquiry.setQuestion("生徒はどの探究状態で困っていると判断していますか？");
        List<String> questions = new ArrayList<>();
        switch (selectedPhase) {
            case "①Problemフェーズ":
                nextInquiry.setType("Pr");
                questions.add("問題未設定状態");
                questions.add("問題発見状態");
                questions.add("問い状態");
                questions.add("仮説状態");
                questions.add("目的変数設定状態");
                questions.add("解決策提案準備状態");
                questions.add("解決策の提案可能状態");
                nextInquiry.setQuestions(questions);
                break;
            case "②Planフェーズ":
                nextInquiry.setType("Pl");
                questions.add("実行不明状態");
                questions.add("環境要因可能状態");
                questions.add("実行可能状態");
                nextInquiry.setQuestions(questions);
                break;
            case "③Dataフェーズ":
                nextInquiry.setType("D");
                questions.add("データ未取得状態");
                questions.add("データ取得状態");
                questions.add("実行可能状態");
                nextInquiry.setQuestions(questions);
                break;
            case "④Analysisフェーズ":
                nextInquiry.setType("A");
                questions.add("未分析状態");
                questions.add("分析可能状態");
                nextInquiry.setQuestions(questions);
                break;
            case "⑤Conclusionフェーズ":
                nextInquiry.setType("C");
                questions.add("未言語化状態");
                questions.add("結果記載状態");
                questions.add("考察状態");
                nextInquiry.setQuestions(questions);
                break;
        }
        return nextInquiry;
    }
}
