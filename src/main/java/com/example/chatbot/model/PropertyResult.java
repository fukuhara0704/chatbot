package com.example.chatbot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PropertyResult {

        private int propertyId;
        private String answerResult;

    @JsonCreator
    public PropertyResult(
            @JsonProperty("propertyId") int propertyId,
            @JsonProperty("answerResult") String answerResult) {
        this.propertyId = propertyId;
        this.answerResult = answerResult;
    }
}
