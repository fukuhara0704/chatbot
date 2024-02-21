package com.example.chatbot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chatbot.Form.AnswerForm;
import com.example.chatbot.Form.PhaseForm;
import com.example.chatbot.common.InquiryLearningConstants;
import com.example.chatbot.common.StateEnum;
import com.example.chatbot.model.AnswerModel;
import com.example.chatbot.model.Question;
import com.example.chatbot.model.QuestionModel;

@Controller
public class PhaseController {

    @PostMapping("/phase")
    public String showPage(PhaseForm phaseForm, Model model) {
        Integer typeId = phaseForm.getHdId() + 1;
        List<Question> questions = createQuestions(typeId);
        QuestionModel questionModel = createQuestion(typeId, questions);

        model.addAttribute("questionModel", questionModel);
        return "phase";
    }

    private QuestionModel createQuestion(Integer typeId, List<Question> questions) {
        QuestionModel questionModel = new QuestionModel();
        questionModel.setQuestionNum(1);
        if (questions.size() > 1) {
            questionModel.setNextQuestionNum(2);
        } else {
            questionModel.setNextQuestionNum(null);
        }
        questionModel.setPhaseType(typeId);
        questionModel.setQuestion(questions.get(0).getQuestion());
        questionModel.setAnswer(questions.get(0).getAnswer());
        StateEnum.A1.getCode();
        questionModel.setQuestionTitle(null);

        return questionModel;
    }

    @PostMapping("/answer")
    public String showAnswerPage(AnswerForm answerForm, Model model) {

        System.out.println(answerForm.answer);
        Integer phaseType = answerForm.getPhaseType();
        Integer questionNum = answerForm.getQuestionNum();
        Integer nextQuestionNum = answerForm.getNextQuestionNum();

        if (answerForm.answer) {
            List<Question> questions = createQuestions(phaseType);
            AnswerModel answerModel = createAnswer(phaseType, questions, questionNum, nextQuestionNum);
            model.addAttribute("questionModel", answerModel);
            return "phase";
        } else {
            AnswerModel answerModel = new AnswerModel();
            answerModel.setAnswerContext(answerForm.getAnswerContext());
            model.addAttribute("answerModel", answerModel);
            return "answer";
        }
    }

    private AnswerModel createAnswer(Integer phaseType, List<Question> questions, Integer questionNum, Integer nextQuestionNum) {
        AnswerModel result = new AnswerModel();
        if (nextQuestionNum != null) {
            questions = createQuestions(phaseType);
            result.setQuestionNum(questionNum + 1);
            if (questions.size() > nextQuestionNum) {
                result.setNextQuestionNum(nextQuestionNum + 1);
            } else {
                result.setNextQuestionNum(null);
            }
            result.setPhaseType(phaseType);
            result.setQuestion(questions.get(questionNum).getQuestion());
            result.setAnswer(questions.get(questionNum).getAnswer());
            result.setQuestionTitle(questions.get(questionNum).getTitle());
        } else {
            phaseType++;
            List<Question> nextQuestions = createQuestions(phaseType);
            result.setQuestionNum(1);
            if(nextQuestions.size() > 1){
                result.setNextQuestionNum(2);
            }else{
                result.setNextQuestionNum(null);
            }
            result.setPhaseType(phaseType);
            result.setQuestion(nextQuestions.get(0).getQuestion());
            result.setAnswer(nextQuestions.get(0).getAnswer());
            result.setAnswerContext(questions.get(questions.size() -1).getNextQuestionContext());
            result.setQuestionTitle(nextQuestions.get(0).getTitle());

        }

        return result;
    }

    private List<Question> createQuestions(int typeId) {
        List<Question> results = new ArrayList<>();
        StateEnum.PR1.getCode();
        switch (typeId) {
            // プロジェクト状態
            case 1:
                results = createPr1Questions();
                break;
            case 2:
                results = createPr2Questions();
                break;
            case 3:
                results = createPr3Questions();
                break;
            case 4:
                results = createPr4Questions();
                break;
            case 5:
                results = createPr5Questions();
                break;
            case 6:
                results = createPr6Questions();
                break;
            case 7:
                results = createPr7Questions();
                break;
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
            // // Analysisフェーズの状態
            // case
            // results = createA1Questions();
            // break;
            // case
            // results = createA2Questions();
            // break;
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

    private List<Question> createPr1Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR1_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR1_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setNextQuestionContext(InquiryLearningConstants.PR1_QUESTION_CONTEXT);
            result.setTitle(InquiryLearningConstants.PR1_NO_ISSUE);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr2Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR2_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR2_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setNextQuestionContext(InquiryLearningConstants.PR2_QUESTION_CONTEXT);
            result.setTitle(InquiryLearningConstants.PR2_ISSUE_FOUND);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr3Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR3_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR3_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setTitle(InquiryLearningConstants.PR3_QUESTION);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr4Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR4_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR4_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setTitle(InquiryLearningConstants.PR4_HYPOTHESIS);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr5Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR5_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR5_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setTitle(InquiryLearningConstants.PR5_TARGET_VARIABLE_SET);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr6Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR6_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR6_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setTitle(InquiryLearningConstants.PR6_SOLUTION_PROPOSAL_PREPARATION);
            num++;
            results.add(result);
        }
        return results;
    }
    private List<Question> createPr7Questions() {
        List<Question> results = new ArrayList<>();

        List<String> questions = InquiryLearningConstants.PR7_QUESTIONS;
        List<String> answers = InquiryLearningConstants.PR7_ANSWERS;
        int num = 0;
        for (String question : questions) {
            Question result = new Question();
            result.setId(num + 1);
            result.setQuestion(question);
            result.setAnswer(answers.get(num));
            result.setNextQuestionContext(InquiryLearningConstants.PR7_QUESTION_CONTEXT);
            result.setTitle(InquiryLearningConstants.PR7_SOLUTION_PROPOSAL_POSSIBLE);
            num++;
            results.add(result);
        }
        return results;
    }
}
