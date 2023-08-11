package com.mewtwo.springchatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@CrossOrigin
@RestController
@RequestMapping("/")
public class SpringChatAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringChatAppApplication.class, args);
    }
    @GetMapping
    public String nice(){
        return "nice";
    }
}
