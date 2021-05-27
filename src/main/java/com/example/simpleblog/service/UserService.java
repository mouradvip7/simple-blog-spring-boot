package com.example.simpleblog.service;

import com.example.simpleblog.entities.User;
import com.example.simpleblog.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

}