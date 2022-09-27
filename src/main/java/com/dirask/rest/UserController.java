package com.dirask.rest;

import com.dirask.model.UserEntity;
import com.dirask.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/users"))
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
