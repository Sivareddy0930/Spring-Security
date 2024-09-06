package com.sivasolutions.springBootSecurity.controller;

import com.sivasolutions.springBootSecurity.model.Users;
import com.sivasolutions.springBootSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.regetUsers(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verifyLogin(user);
    }
}
