package com.example.userstore.model;

import java.util.Objects;

public class User {
    private final int id;
    private final String name;
    private final String email;
    private final String nickName;

    public User(int id, String name, String email, String nickName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
