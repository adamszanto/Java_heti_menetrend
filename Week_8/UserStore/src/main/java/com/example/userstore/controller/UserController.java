package com.example.userstore.controller;

import com.example.userstore.controller.dto.UserDto;
import com.example.userstore.mapper.UserMapper;
import com.example.userstore.service.UserService;
import com.example.userstore.service.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    // Logolás know-how:

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    // Mindig az slf4j
    // TODO: Mi az a logging, mi a haszna...?
    // TODO prio: Log levelek/szintek: Trace, Debug, Info, Warning, Error

    private final UserService userService;
    private final UserMapper mapper;
    private final Integer numberOfKiskutya;
    @Autowired
    public UserController(UserService userService, UserMapper mapper, @Value("${kiskutya.kismacska}") Integer numberOfKiskutya) {
        this.userService = userService;
        this.mapper = mapper;
        this.numberOfKiskutya = numberOfKiskutya;
        logger.info("Number of kiskutya: {}", numberOfKiskutya);
    }

    @GetMapping
    public void getAllUsers() {
        logger.info("Got all users");
        userService.getAllUsers();
    }

    @GetMapping("{id}")
    public UserDto getUserById(@PathVariable(value = "id") int id) {
        logger.info("Got user id");
        User user = userService.getUserById(id);
        return mapper.convertModelToDto(user);

    }

    // TODO: Kiíratni majd az actiont...
    // TODO: sout helyett logolás...
    @GetMapping(params = "action=count")
    public int countUsers() {
        logger.info("Counted: {}", userService.countUsers());
        return userService.countUsers();
    }

//    @PostMapping
//    public User createUser(User user) {
//        System.out.println("User has been created.");
//        return userService.createUser(user);
//    }

    @PostMapping
    public UserDto createUser() {
        logger.info("Got all users");
        User user = userService.createUser();
        return mapper.convertModelToDto(user);
    }
}
