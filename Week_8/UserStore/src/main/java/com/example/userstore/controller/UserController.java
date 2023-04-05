package com.example.userstore.controller;

import com.example.userstore.model.User;
import com.example.userstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public void getAllUsers() {
        System.out.println("All users have been got.");
        userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        System.out.println(id + " has been requested.");
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(User user) {
        System.out.println("User has been created.");
        return userService.createUser(user);
    }
}
