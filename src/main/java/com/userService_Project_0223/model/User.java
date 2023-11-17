package com.userService_Project_0223.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;


public class User {

    @JsonProperty("id")
    private Integer userId;
    @JsonProperty("name")
    private String userName;
    @JsonProperty("last_name")
    private String userLastName;
    @JsonProperty("email")
    private String userEmail;
    @JsonProperty("age")
    private Integer userAge;
    @JsonProperty("address")
    private String address;
    @JsonProperty("joining_date")
    private LocalDate joiningDate;


    public User(Integer userId, String userName, String userLastName, String userEmail, Integer userAge, String address, LocalDate joiningDate) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.address = address;
        this.joiningDate = joiningDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
