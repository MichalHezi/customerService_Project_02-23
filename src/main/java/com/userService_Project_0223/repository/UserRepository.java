package com.userService_Project_0223.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.userService_Project_0223.model.User;

import java.util.List;

public interface UserRepository {

    Integer createUser(User customer);
    String updateUserName(int id, String name);
    String deleteUserById(int id);
    String updateUserEmail(int id, String email);

    User getUserById(Integer id);
    //getCustomerByName
    List<User> getAllUsers();
    List<String> getAllUserNames();
}
