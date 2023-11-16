package com.userService_Project_0223.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userService_Project_0223.model.User;
import com.userService_Project_0223.repository.mapper.UserMapper;
import com.userService_Project_0223.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public Integer createUser(User user) {
        String sql = "INSERT INTO" + Constants.CUSTOMER_TABLE_NAME + "(first_name, last_name, email, age, address) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql,user.getUserName(),user.getUserLastName(),user.getUserEmail(),user.getUserAge(),user.getAddress());
        sql = "SELECT MAX(id) FROM " + Constants.CUSTOMER_TABLE_NAME;
        return jdbcTemplate.queryForObject(sql,Integer.class);

    }

    @Override
    public String deleteUserById(int id) {
        String sql = "DELETE FROM " + Constants.CUSTOMER_TABLE_NAME + " WHERE id = ?";
        if (jdbcTemplate.update(sql,id) == 1){
            return "User with id " + id + " was deleted";
        }else{
            return "Customer with id " + id + " was not found";
        }
    }


    @Override
    public String updateUserName(int id, String name) {
        String sql = "UPDATE " + Constants.CUSTOMER_TABLE_NAME + " SET first_name = ? WHERE id = ?";
        if (jdbcTemplate.update(sql,name,id) == 1){
            return "User's name with id " + id + " was update to " + name;
        }else{
            return "User with id " + id + " was not found";
        }
    }

    @Override
    public String updateUserLastName(int id, String lastName) {
        String sql = "UPDATE " + Constants.CUSTOMER_TABLE_NAME + " SET last_name = ? WHERE id = ?";
        if (jdbcTemplate.update(sql,lastName,id) == 1){
            return "User's last name with id " + id + " was update to " + lastName;
        }else{
            return "User with id " + id + " was not found";
        }
    }

    @Override
    public String updateUserEmail(int id, String email) {
        String sql = "UPDATE " + Constants.CUSTOMER_TABLE_NAME + " SET email = ? WHERE id = ?";
        if (jdbcTemplate.update(sql,email,id) == 1){
            return "User's email with id " + id + " was updated to " + email;
        }else{
            return "User with id " + id + " was not found";
        }
    }

    @Override
    public Integer updateUserAge(int id, Integer age) {
        String sql = "UPDATE " + Constants.CUSTOMER_TABLE_NAME + " SET age = ? WHERE id = ?";
        return jdbcTemplate.update(sql,age,id);
    }

    @Override
    public String updateUserAddress(int id, String address) {
        String sql = "UPDATE " + Constants.CUSTOMER_TABLE_NAME + " SET address = ? WHERE id = ?";
        if (jdbcTemplate.update(sql,address,id) == 1){
            return "User's address with id " + id + " was update to " + address;
        }else{
            return "User's with id " + id + " was not found";
        }
    }

    @Override
    public User getUserById(Integer id) {
        String sql = "SELECT * FROM " + Constants.CUSTOMER_TABLE_NAME + " WHERE id = ?";
            return jdbcTemplate.queryForObject(sql,new UserMapper(),id);
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM " + Constants.CUSTOMER_TABLE_NAME;
        return jdbcTemplate.query(sql,new UserMapper());
    }

    @Override
    public List<String> getAllUserNames() {
        String sql = "SELECT first_name FROM " + Constants.CUSTOMER_TABLE_NAME;
        return jdbcTemplate.queryForList(sql,String.class);
    }
}
