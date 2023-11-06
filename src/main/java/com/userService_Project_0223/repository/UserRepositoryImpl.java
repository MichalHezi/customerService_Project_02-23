package com.userService_Project_0223.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.userService_Project_0223.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Integer createUser(User customer) {
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
