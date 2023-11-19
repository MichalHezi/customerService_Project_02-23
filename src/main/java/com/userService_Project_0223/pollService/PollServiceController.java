package com.userService_Project_0223.pollService;

import com.userService_Project_0223.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class PollServiceController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getAllAnswers")
    String getAllAnswersUserByIde(@RequestParam int id){
        return null;
    }




}
