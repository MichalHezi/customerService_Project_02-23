package com.userService_Project_0223.service;

import com.userService_Project_0223.model.UserAnswer;
import com.userService_Project_0223.repository.UserAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAnswerService {

    @Autowired
    private UserAnswerRepository userAnswerRepository;

}
