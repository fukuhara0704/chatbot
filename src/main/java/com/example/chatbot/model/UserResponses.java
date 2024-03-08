package com.example.chatbot.model;

import java.util.Date;

public class UserResponses {
    private Integer id;

    private String username;

    private Date registrationDate;

    private Integer lastAnswerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getLastAnswerId() {
        return lastAnswerId;
    }

    public void setLastAnswerId(Integer lastAnswerId) {
        this.lastAnswerId = lastAnswerId;
    }
}