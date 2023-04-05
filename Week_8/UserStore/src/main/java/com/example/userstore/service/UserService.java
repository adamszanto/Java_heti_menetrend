package com.example.userstore.service;

import com.example.userstore.model.User;
import com.example.userstore.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }
    public User getUserById(int id) {
        return userRepository.getUserByInt(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
