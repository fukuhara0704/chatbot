package com.example.chatbot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatbot.Form.AnswerForm;
import com.example.chatbot.Form.PhaseForm;
import com.example.chatbot.common.AnalysisAnswerEnum;
import com.example.chatbot.common.AnalysisQuestionEnum;
import com.example.chatbot.common.AnalysisTitleEnum;
import com.example.chatbot.common.ConclusionAnswerEnum;
import com.example.chatbot.common.ConclusionQuestionEnum;
import com.example.chatbot.common.ConclusionTitleEnum;
import com.example.chatbot.common.DataAnswerEnum;
import com.example.chatbot.common.DataQuestionEnum;
import com.example.chatbot.common.DataTitleEnum;
import com.example.chatbot.common.MainExploreConstants;
import com.example.chatbot.common.PhaseTypeEnum;
import com.example.chatbot.common.PlanAnswerEnum;
import com.example.chatbot.common.PlanQuestionEnum;
import com.example.chatbot.common.PlanTitleEnum;
import com.example.chatbot.common.ProblemAnswerEnum;
import com.example.chatbot.common.ProblemQuestionEnum;
import com.example.chatbot.common.ProblemTitleEnum;
import com.example.chatbot.common.QuestionContextEnum;
import com.example.chatbot.model.AnswerModel;
import com.example.chatbot.model.ExplorationProperty;
import com.example.chatbot.model.Question;
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
    public String showFirstPage(PhaseForm phaseForm, Model model) {
        Integer nextPropertyId = phaseForm.getNextPropertyId();

        // 質問の作成
        // Question question = createQuestion(propertyType, id);
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
    public String showAnswerPage(AnswerForm answerForm, Model model) {


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

    /**
     * 
     * @param propertyType
     * @param id
     * @return
     */
    private Question createQuestion(String propertyType, int id) {
        Question results = new Question();

        switch (propertyType) {
            // ①Problemフェーズ
            case MainExploreConstants.PROBLEM:
                results = createProblemQuestion(id);
                break;
            // ②Planフェーズ
            case MainExploreConstants.PLAN:
                results = createPlanQuestion(id);
                break;
            // ③Dataフェーズ
            case MainExploreConstants.DATA:
                results = createDataQuestion(id);
                break;
            // ④Analysisフェーズ
            case MainExploreConstants.ANALYSIS:
                results = createAnalysisQuestion(id);
                break;
            // ⑤Conclusionフェーズ
            case MainExploreConstants.CONCLUSION:
                results = createConclusionQuestion(id);
                break;

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
    private Question createConclusionQuestion(int id) {
        Question result = new Question();

        String title = ConclusionTitleEnum.getVauleById(id);
        String question = ConclusionQuestionEnum.getVauleById(id);
        String answer = ConclusionAnswerEnum.getVauleById(id);
        String questionContext = QuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.CONCLUSION));
        result.setTitle(title);
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        return result;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private Question createAnalysisQuestion(int id) {
        Question result = new Question();

        String title = AnalysisTitleEnum.getVauleById(id);
        String question = AnalysisQuestionEnum.getVauleById(id);
        String answer = AnalysisAnswerEnum.getVauleById(id);
        String questionContext = QuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.ANALYSIS));
        result.setTitle(title);
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        return result;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private Question createDataQuestion(int id) {
        Question result = new Question();

        String title = DataTitleEnum.getVauleById(id);
        String question = DataQuestionEnum.getVauleById(id);
        String answer = DataAnswerEnum.getVauleById(id);
        String questionContext = QuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.DATA));
        result.setTitle(title);
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        return result;
    }

    /**
     * フェーズの状態の質問リストの作成
     * @param id
     * @return
     */
    private Question createPlanQuestion(int id) {
        Question result = new Question();

        String title = PlanTitleEnum.getVauleById(id);
        String question = PlanQuestionEnum.getVauleById(id);
        String answer = PlanAnswerEnum.getVauleById(id);
        String questionContext = QuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.PROBLEM));
        result.setTitle(title);
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        return result;
    }

    /**
     * フェーズの状態の質問の作成
     * @param id
     * @return
     */
    private Question createProblemQuestion(int id) {
        Question result = new Question();

        String title = ProblemTitleEnum.getVauleById(id);
        String question = ProblemQuestionEnum.getVauleById(id);
        String answer = ProblemAnswerEnum.getVauleById(id);
        String questionContext = QuestionContextEnum.getVauleById(id);

        result.setId(id);
        result.setNextId(id + 1);
        result.setPhaseType(getPhaseType(id, MainExploreConstants.PROBLEM));
        result.setTitle(title);
        result.setQuestion(question);
        result.setAnswer(answer);
        result.setQuestionContext(questionContext);
        return result;
    }

    /**
     * 
     * @param id
     * @param phaseType
     * @return
     */
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
