package com.mewtwo.springchatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class SpringChatAppApplication {
    @GetMapping
    public String test(){
        return "This works";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringChatAppApplication.class, args);
    }
}
