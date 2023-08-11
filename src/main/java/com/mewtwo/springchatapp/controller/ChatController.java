package com.mewtwo.springchatapp.controller;

import com.mewtwo.springchatapp.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class ChatController {
    public List<Message> messages = new ArrayList<>();
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public List<Message> greeting(Message message) throws Exception {
        Thread.sleep(100);
        Message response = new Message();
        response.setMessage(message.getMessage());
        messages.add(response);
        return messages;
    }
}
