package com.example.userstore.controller.dto;

import com.example.userstore.service.model.User;

import java.util.Objects;

public class UserDto {
    private User user;

    public UserDto() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDto userDto = (UserDto) o;

        return Objects.equals(user, userDto.user);
    }

    @Override
    public int hashCode() {
        return user != null ? user.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "user=" + user +
                '}';
    }
}
