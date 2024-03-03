package com.example.chatbot.model;

public class SubPhases {
    private Integer subPhaseId;

    private String subPhaseName;

    private Integer nextPropertyId;

    private String type;

    public Integer getSubPhaseId() {
        return subPhaseId;
    }

    public void setSubPhaseId(Integer subPhaseId) {
        this.subPhaseId = subPhaseId;
    }

    public String getSubPhaseName() {
        return subPhaseName;
    }

    public void setSubPhaseName(String subPhaseName) {
        this.subPhaseName = subPhaseName;
    }

    public Integer getNextPropertyId() {
        return nextPropertyId;
    }

    public void setNextPropertyId(Integer nextPropertyId) {
        this.nextPropertyId = nextPropertyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}