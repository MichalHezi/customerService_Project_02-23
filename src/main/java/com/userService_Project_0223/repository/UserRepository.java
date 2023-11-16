package com.userService_Project_0223.repository;

import com.userService_Project_0223.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    Integer createUser(User user);
    String deleteUserById(int id);
    String updateUserName(int id, String name);
    String updateUserLastName(int id, String lastName);
    String updateUserEmail(int id, String email);
    Integer updateUserAge(int id, Integer age);
    String updateUserAddress(int id, String address);
    User getUserById(Integer id);
    List<User> getAllUsers();
    List<String> getAllUserNames();


}
