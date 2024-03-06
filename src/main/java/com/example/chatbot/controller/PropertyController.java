package com.example.chatbot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatbot.Form.AnswerForm;
import com.example.chatbot.Form.PhaseForm;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.service.PropertyService;

/*
 * プロパティのコントローラークラス
 */
@Controller
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    /**
     * プロパティ項目の初期画面表示処理
     * @param phaseForm
     * @param model
     * @return
     */
    @PostMapping("/phase")
    public String showFirstPage(Authentication loginUser, PhaseForm phaseForm, Model model) {
        Integer nextPropertyId = phaseForm.getNextPropertyId();

        // 質問の作成
        ExplorationProperty explorationProperty = propertyService.getExplorationProperty(nextPropertyId);

        model.addAttribute("explorationProperty", explorationProperty);
        return "phase";
    }

    /**
     * 回答に対する画面表示処理
     * @param answerForm
     * @param model
     * @return
     */
    @PostMapping("/answer")
    public String showAnswerPage(Authentication loginUser, AnswerForm answerForm, Model model) {


        Integer nextPropertyId = answerForm.getNextPropertyId();
        String nextContext = answerForm.getNextContext();

        if (answerForm.answer) {
            if(answerForm.getNextPropertyId() != null){
                ExplorationProperty explorationProperty = propertyService.getExplorationProperty(nextPropertyId);
                model.addAttribute("explorationProperty", explorationProperty);
                model.addAttribute("nextContext", nextContext);
                return "phase";
            }else{
                return "finish";
            }
        } else {
            model.addAttribute("propertyAnswer", answerForm.getPropertyAnswer());
            return "answer";
        }
    }
}
