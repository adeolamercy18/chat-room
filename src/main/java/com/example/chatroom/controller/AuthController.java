package com.example.chatroom.controller;

import com.example.chatroom.model.User;
import com.example.chatroom.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {

    private final AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user) {
        return authService.register(user);
    }
    @PostMapping("/login")
    @ResponseBody
    public String login (@RequestBody User user) {
        boolean successful = authService.login(
                user.getUsername(),
                user.getPassword()
        );
        if(successful) {
            return "Login successful";
        }
        return "invalid username or password";
    }
}
