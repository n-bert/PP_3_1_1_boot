package com.example.springboot.dao;

import com.example.springboot.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDAO {
    @Transactional
    void saveUser(User user);

    void updateUser(int id, User updatedUser);

    User getUser(int id);

    List<User> getAllUsers();

    void deleteUser(int id);
}
