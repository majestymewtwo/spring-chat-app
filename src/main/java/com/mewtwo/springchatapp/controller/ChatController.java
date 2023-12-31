package com.mewtwo.springchatapp.controller;

import com.mewtwo.springchatapp.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class ChatController {
    private final SimpMessagingTemplate simpMessagingTemplate;
    public List<Message> messages = new ArrayList<>();
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public List<Message> greeting(@Payload Message message, @Header("simpSessionId") String sessionId) throws Exception {
        messages.add(message);
        return messages;
    }
    @MessageMapping("/user-message")
    public List<Message> sendMessage(@Payload Message message) {
        System.out.println(message.getReceiver());
        messages.add(message);
        simpMessagingTemplate.convertAndSendToUser(message.getReceiver(), "/private", message);
        return messages;
    }
}
