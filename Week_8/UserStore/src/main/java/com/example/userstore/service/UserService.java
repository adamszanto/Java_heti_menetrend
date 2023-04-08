package com.example.userstore.service;

import com.example.userstore.mapper.UserMapper;
import com.example.userstore.repository.entity.UserEntity;
import com.example.userstore.service.model.User;
import com.example.userstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Autowired
    public UserService (UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }
    public List<User> getAllUsers() {
        return userRepository.getAll().stream()
                .map(userEntity -> userMapper.convertEntityToModel(userEntity))
                .collect(Collectors.toList());
    }
    public User getUserById(int id) {
        UserEntity entity = userRepository.getUserByInt(id);
        return userMapper.convertEntityToModel(entity);
    }

    public User createUser() {
        UserEntity entity = userRepository.save();
        return userMapper.convertEntityToModel(entity);
    }

    public int countUsers() {
        return userRepository.count();
    }
}
