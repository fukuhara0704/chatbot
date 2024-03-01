package com.example.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chatbot.Form.MainPhaseForm;
import com.example.chatbot.common.MainExploreConstants;
import com.example.chatbot.model.ExplorationPhases;
import com.example.chatbot.model.Phase;
import com.example.chatbot.model.SubExplorePhaseModel;
import com.example.chatbot.service.ExploreService;
import java.util.List;

/*
 * 探究フェーズのコントローラークラス
 */
@Controller
public class ExploreController {

    @Autowired
    private ExploreService exploreService;

    /**
     * メインの探究フェーズの画面表示処理
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String showMainPhasePage(Model model) {


        // 探究フェーズ情報を取得
        ExplorationPhases explorationPhase = exploreService.getExplorationPhase();

        // フェーズ情報を取得
        List<Phase> phases  = exploreService.getPhases();

        // メインの探究フェーズのタイトルをModelに追加
        model.addAttribute("title", explorationPhase.getTitle());
        // メインの探究フェーズの質問文をModelに追加
        model.addAttribute("question", explorationPhase.getQuestion());
        // メインの探究フェーズの選択肢をModelに追加
        model.addAttribute("phases", phases);

        return "main_phase";
    }

    /**
     * サブの探究フェーズの画面表示処理
     * @param selectedPhaseForm
     * @param model
     * @return
     */
    @PostMapping("/sub")
    public String showSubPhasePage(MainPhaseForm mainPhaseForm, Model model) {

        // 選択された探究フェーズ
        String selectedMainPhase = mainPhaseForm.getSelectedMainPhase();

        // サブ探究フェーズの作成
        SubExplorePhaseModel subExplorePhase = createSubExplorePhase(selectedMainPhase);

        model.addAttribute("subExplorePhase", subExplorePhase);
        return "sub_phase";
    }

    /**
     * サブ探究フェーズの作成
     * @param selectedMainPhase 選択されたメイン探究フェーズ
     * @return
     */
    private SubExplorePhaseModel createSubExplorePhase(String selectedMainPhase) {

        SubExplorePhaseModel subExplorePhase = new SubExplorePhaseModel();
        subExplorePhase.setTitle(MainExploreConstants.MAIN_PHASE_TITLE);
        subExplorePhase.setQuestion(MainExploreConstants.MAIN_PHASE_QUESTION);

        switch (selectedMainPhase) {
            case "①Problemフェーズ":
                subExplorePhase.setType(MainExploreConstants.PROBLEM);
                subExplorePhase.setQuestions(MainExploreConstants.PROBLEM_PHASE_LIST);
                break;
            case "②Planフェーズ":
                subExplorePhase.setType(MainExploreConstants.PLAN);
                subExplorePhase.setQuestions(MainExploreConstants.PLAN_PHASE_LIST);
                break;
            case "③Dataフェーズ":
                subExplorePhase.setType(MainExploreConstants.DATA);
                subExplorePhase.setQuestions(MainExploreConstants.DATA_PHASE_LIST);
                break;
            case "④Analysisフェーズ":
                subExplorePhase.setType(MainExploreConstants.ANALYSIS);
                subExplorePhase.setQuestions(MainExploreConstants.ANALYSIS_PHASE_LIST);
                break;
            case "⑤Conclusionフェーズ":
                subExplorePhase.setType(MainExploreConstants.CONCLUSION);
                subExplorePhase.setQuestions(MainExploreConstants.CONCLUSION_PHASE_LIST);
                break;
        }
        return subExplorePhase;
    }
}
