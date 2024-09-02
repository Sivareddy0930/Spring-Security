package com.sivasolutions.springBootSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/home")
    public String greet(HttpServletRequest request) {
        return "Hello, Spring Boot Security! with session Id:-"+request.getSession().getId();
    }
}
