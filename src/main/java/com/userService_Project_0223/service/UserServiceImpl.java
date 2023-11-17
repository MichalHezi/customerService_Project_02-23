package com.userService_Project_0223.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userService_Project_0223.model.User;
import com.userService_Project_0223.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl userRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public Integer createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public String updateUserName(int id, String name) {
        return userRepository.updateUserName(id,name);
    }

    @Override
    public String deleteUserById(int id) {
        return null;
    }

    @Override
    public String updateUserEmail(int id, String email) {
        return userRepository.updateUserEmail(id,email);
    }
    @Override
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<String> getAllUserNames() {
        return userRepository.getAllUserNames();
    }
}
