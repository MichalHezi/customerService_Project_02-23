package com.userService_Project_0223.pollService;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "pollSpringProjectService",
        url = "${second_micro_service.url}"
)
public interface PollSpringProjectService {

}
