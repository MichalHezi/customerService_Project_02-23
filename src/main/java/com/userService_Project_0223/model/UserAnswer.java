package com.userService_Project_0223.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.aspectj.weaver.tools.PointcutPrimitive;
import org.springframework.data.annotation.Id;


public class UserAnswer {
    private Integer id;
    private Integer userId;
    private Integer questionId;
    private String selectedOption;

    public UserAnswer(Integer id, Integer userId, Integer questionId, String selectedOption) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.selectedOption = selectedOption;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
}
