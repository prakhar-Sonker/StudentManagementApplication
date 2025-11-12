
package com.example.studentManagementApp.service;

import com.example.studentManagementApp.dto.LoginRequest;
import com.example.studentManagementApp.dto.RegisterRequest;
import com.example.studentManagementApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    private final List<User> users = new ArrayList<>();

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request){
        for (User user : users) {
            if (user.getUserName().equals(request.getUsername())) {
                return "❌ Username already exists!";
            }
        }
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        User newUser = new User(
                request.getUsername(),
                request.getEmail(),
                encodedPassword,
                request.getRole()
        );

        users.add(newUser);
        return "✅ User registered successfully!";
    }

    public String login(LoginRequest request) {
        for (User user : users) {
            if (user.getUserName().equals(request.getUsername())) {
                // username exists, now check password
                boolean isPasswordMatch = passwordEncoder.matches(request.getPassword(), user.getPassword());

                if (isPasswordMatch) {
                    return "✅ Login successful! Welcome " + user.getUserName();
                } else {
                    return "❌ Invalid password!";
                }
            }
        }

        return "❌ Username not found!";
    }


    public List<User> getAllUsers(){
        return new ArrayList<>(users);
    }


}
