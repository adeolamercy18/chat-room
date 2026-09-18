package com.example.chatroom.service;

import com.example.chatroom.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    private final Map<String, User> users = new HashMap<>();

    public String register(User user){

        if (users.containsKey(user.getUsername())) {
            return "Username already exists";
        }

        users.put(user.getUsername(), user);
        return "Registration successful";
    }
    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }
}
