package com.userService_Project_0223.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.userService_Project_0223.model.User;
import com.userService_Project_0223.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public Integer createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping
    public String deleteUserById(@RequestParam int id){
        return userService.deleteUserById(id);
    }

    @PutMapping("/update/first-name")
    public String updateFirstName(@RequestBody User user){
        if (user.getUserId() == 0 || user.getUserName() == null){
            return "Can't change stuff to null";
        }else{
            return userService.updateUserName(user.getUserId(),user.getUserName());
        }
    }

    @PutMapping("/update/last-name")
    public String updateLastName(@RequestBody User user){
        if (user.getUserId() == 0 || user.getUserLastName() == null){
            return "Can't change stuff to null";
        }else{
            return userService.updateUserName(user.getUserId(),user.getUserLastName());
        }
    }

    @PutMapping("/update/email")
    public String updateUserEmail(@RequestBody User user){
        if (user.getUserId() == 0 || user.getUserEmail() == null){
            return "Can't change stuff to null";
        }else{
            return userService.updateUserEmail(user.getUserId(),user.getUserEmail());
        }
    }

    @GetMapping
    public User getUserById(@RequestParam int id){
        return userService.getUserById(id);
    }
    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping(value = "/names")
    public List<String> getAllUserName(){
        return userService.getAllUserNames();
    }
}
