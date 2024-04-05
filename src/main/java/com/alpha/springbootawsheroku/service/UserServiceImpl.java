package com.alpha.springbootawsheroku.service;

import com.alpha.springbootawsheroku.model.User;
import com.alpha.springbootawsheroku.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public List<User> findUsers(){
        return userRepository.findAll();
    }
}
