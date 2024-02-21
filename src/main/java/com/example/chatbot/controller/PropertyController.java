package com.example.chatbot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatbot.Form.AnswerForm;
import com.example.chatbot.Form.PhaseForm;
import com.example.chatbot.common.InquiryLearningConstants;
import com.example.chatbot.common.MainExploreConstants;
import com.example.chatbot.common.PhaseTypeEnum;
import com.example.chatbot.common.ProblemAnswerEnum;
import com.example.chatbot.common.ProblemQuestionContextEnum;
import com.example.chatbot.common.ProblemQuestionEnum;
import com.example.chatbot.common.ProblemTitleEnum;
import com.example.chatbot.common.StateEnum;
import com.example.chatbot.model.AnswerModel;
import com.example.chatbot.model.Question;
import com.example.chatbot.model.QuestionModel;

/*
 * プロパティのコントローラークラス
 */
@Controller
public class PropertyController {

    /**
     * プロパティ項目の初期画面表示処理
     * @param phaseForm
     * @param model
     * @return
     */
    @PostMapping("/phase")
    public String showFirstPage(PhaseForm phaseForm, Model model) {
        // 質問の
        Integer id = phaseForm.getHdId();
        String propertyType = phaseForm.getType();

        // 質問の作成
        Question question = createQuestion(propertyType, id);

        model.addAttribute("question", question);
        return "phase";
    }

    /**
     * 回答に対する画面表示処理
     * @param answerForm
     * @param model
     * @return
     */
    @PostMapping("/answer")
    public String showAnswerPage(AnswerForm answerForm, Model model) {


        Integer id = answerForm.getId();
        String propertyType = answerForm.getPhaseType();

        if (answerForm.answer) {
            // 質問の作成
            Question question = createQuestion(propertyType, id);
            model.addAttribute("question", question);
            return "phase";
        } else {
            AnswerModel answerModel = new AnswerModel();
            answerModel.setAnswerContext(answerForm.getAnswerContext());
            model.addAttribute("answerModel", answerModel);
            return "answer";
        }
    }

    private Question createQuestion(String propertyType, int id) {
        Question results = new Question();

        switch (propertyType) {
            // ①Problemフェーズ
            case MainExploreConstants.PROBLEM:
                results = createProblemQuestion(id);
                break;
            // // ②Planフェーズ
            // case MainExploreConstants.PLAN:
            //     results = createPlanQuestions(id);
            //     break;
            // // ③Dataフェーズ
            // case MainExploreConstants.DATA:
            //     results = createDataQuestions(id);
            //     break;
            // // ④Analysisフェーズ
            // case MainExploreConstants.ANALYSIS:
            //     results = createAnalysisQuestions(id);
            //     break;
            // // ⑤Conclusionフェーズ
            // case MainExploreConstants.CONCLUSION:
            //     results = createConclusionQuestions(id);
            //     break;

            default:
                break;
        }
        return results;
    }

    /**
     * Conclusionフェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private List<Question> createConclusionQuestions(int id) {
        List<Question> results = new ArrayList<>();

        switch (id) {
            // // Conclusionフェーズの状態
            // case
            // results = createC1Questions();
            // break;
            // case
            // results = createC2Questions();
            // break;
            // case
            // results = createC3Questions();
            // break;
            default:
                break;
        }
        return results;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private List<Question> createAnalysisQuestions(int id) {
        List<Question> results = new ArrayList<>();

        switch (id) {
            // // Analysisフェーズの状態
            // case
            // results = createA1Questions();
            // break;
            // case
            // results = createA2Questions();
            // break;
            default:
                break;
        }
        return results;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private List<Question> createDataQuestions(int id) {
        List<Question> results = new ArrayList<>();

        switch (id) {
            // // // Dataフェーズの状態
            // case
            // results = createD1Questions();
            // break;
            // case
            // results = createD2Questions();
            // break;
            // case
            // results = createD3Questions();
            // break;
            default:
                break;
        }
        return results;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private List<Question> createPlanQuestions(int id) {
        List<Question> results = new ArrayList<>();

        switch (id) {
            // // Planフェーズの状態
            // case
            // results = createPl1Questions();
            // break;
            // case
            // results = createPl2Questions();
            // break;
            // case
            // results = createPl3Questions();
            // break;
            default:
                break;
        }
        return results;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private Question createProblemQuestion(int id) {
        Question result = new Question();

        String title = ProblemTitleEnum.getVauleById(id);
        String question = ProblemQuestionEnum.getVauleById(id);
        String answer = ProblemAnswerEnum.getVauleById(id);
        String questionContext = ProblemQuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.PROBLEM));
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        result.setTitle(title);
        result.setPhaseType(MainExploreConstants.PROBLEM);
        return result;
    }

    private String getPhaseType(int id, String phaseType) {

        String result = phaseType;

        if(id > ProblemQuestionEnum.values().length){
            // 次のphaseTypeを取得
            Integer cuurentId = PhaseTypeEnum.getIdByLabel(phaseType);
            String nextPhaseType = PhaseTypeEnum.getVauleById(cuurentId);
            result = nextPhaseType;
        }
        return result;
    }
}
