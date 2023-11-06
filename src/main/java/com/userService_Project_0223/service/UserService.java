package com.userService_Project_0223.service;

import com.userService_Project_0223.model.User;

import java.util.List;

public interface UserService {

    Integer createUser(User user);
    String updateUserName(int id, String name);
    String deleteUserById(int id);
    String updateUserEmail(int id, String email);

    User getUserById(Integer id);
    List<User> getAllUsers();
    List<String> getAllUserNames();


}
