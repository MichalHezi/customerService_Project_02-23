package com.userService_Project_0223.pollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poll")
public class PollServiceController {

    @Autowired
    private PollServiceController pollServiceController;

    @GetMapping
    String getStringFromSecondMicroService(){
        return pollServiceController.getStringFromSecondMicroService();
    }
}
