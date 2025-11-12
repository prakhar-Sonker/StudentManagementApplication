package com.example.studentManagementApp.controller;

import com.example.studentManagementApp.dto.LoginRequest;
import com.example.studentManagementApp.dto.RegisterRequest;
import com.example.studentManagementApp.model.User;
import com.example.studentManagementApp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return authService.getAllUsers();
    }
}
