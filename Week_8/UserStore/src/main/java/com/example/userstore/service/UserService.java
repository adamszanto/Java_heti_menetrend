package com.example.userstore.service;

import com.example.userstore.model.User;
import com.example.userstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }
    public User getUserById(int id) {
        return userRepository.getUserByInt(id);
    }

//    public User createUser(User user) {
//        return userRepository.save(user);
//    }

    public User createUser() {
        return userRepository.save();
    }

    public int countUsers() {
        return userRepository.count();
    }
}
