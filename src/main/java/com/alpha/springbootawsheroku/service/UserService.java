package com.alpha.springbootawsheroku.service;

import com.alpha.springbootawsheroku.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
    List<User> findUsers();
}
