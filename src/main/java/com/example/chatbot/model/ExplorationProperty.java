package com.example.chatbot.model;

public class ExplorationProperty {
    private Integer propertyId;

    private String propertyQuestion;

    private String propertyAnswer;

    private Integer nextPropertyId;

    private String propertySubQuestion;

    private String propertySubAnswerYes;

    private String propertySubAnswerNo;

    private String nextContext;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyQuestion() {
        return propertyQuestion;
    }

    public void setPropertyQuestion(String propertyQuestion) {
        this.propertyQuestion = propertyQuestion;
    }

    public String getPropertyAnswer() {
        return propertyAnswer;
    }

    public void setPropertyAnswer(String propertyAnswer) {
        this.propertyAnswer = propertyAnswer;
    }

    public Integer getNextPropertyId() {
        return nextPropertyId;
    }

    public void setNextPropertyId(Integer nextPropertyId) {
        this.nextPropertyId = nextPropertyId;
    }

    public String getPropertySubQuestion() {
        return propertySubQuestion;
    }

    public void setPropertySubQuestion(String propertySubQuestion) {
        this.propertySubQuestion = propertySubQuestion;
    }

    public String getPropertySubAnswerYes() {
        return propertySubAnswerYes;
    }

    public void setPropertySubAnswerYes(String propertySubAnswerYes) {
        this.propertySubAnswerYes = propertySubAnswerYes;
    }

    public String getPropertySubAnswerNo() {
        return propertySubAnswerNo;
    }

    public void setPropertySubAnswerNo(String propertySubAnswerNo) {
        this.propertySubAnswerNo = propertySubAnswerNo;
    }

    public String getNextContext() {
        return nextContext;
    }

    public void setNextContext(String nextContext) {
        this.nextContext = nextContext;
    }
}