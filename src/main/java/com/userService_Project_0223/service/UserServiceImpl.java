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
        return null;
    }

    @Override
    public String updateUserName(int id, String name) {
        return null;
    }

    @Override
    public String deleteUserById(int id) {
        return null;
    }

    @Override
    public String updateUserEmail(int id, String email) {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<String> getAllUserNames() {
        return null;
    }
}
