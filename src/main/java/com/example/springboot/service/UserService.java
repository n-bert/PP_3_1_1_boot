package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
