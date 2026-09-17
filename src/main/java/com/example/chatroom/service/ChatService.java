package com.example.chatroom.service;

import com.example.chatroom.model.ChatMessage;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }
}
