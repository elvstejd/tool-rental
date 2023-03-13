package com.elvstejd.toolrental.controller;

import com.elvstejd.toolrental.model.User;
import com.elvstejd.toolrental.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public void registerUser(@RequestBody String user) {
        LOGGER.info("Here is a user: " + user);
        System.out.println(user);
    }
}
