package com.example.userstore.mapper;

import com.example.userstore.controller.dto.UserDto;
import com.example.userstore.repository.entity.UserEntity;
import com.example.userstore.service.model.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserMapper {
    public UserEntity convertModelToEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());
        userEntity.setNickName(user.getNickName());

        return userEntity;
    }

    public User convertEntityToModel(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        user.setEmail(userEntity.getEmail());
        user.setNickName(userEntity.getNickName());

        return user;
    }

    public UserDto convertModelToDto(User user) {
        UserDto dto = new UserDto();
        dto.setUser(user);

        return dto;
    }
}
