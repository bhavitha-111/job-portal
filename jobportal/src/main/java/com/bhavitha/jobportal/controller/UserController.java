package com.bhavitha.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bhavitha.jobportal.entity.User;
import com.bhavitha.jobportal.repository.UserRepository;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    // REGISTER
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepo.save(user);
    }

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        Optional<User> existingUser =
                userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (existingUser.isPresent()) {
            return "Login Successful";
        } else {
            return "Invalid Email or Password";
        }
    }
}
