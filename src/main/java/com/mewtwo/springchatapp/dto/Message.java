package com.mewtwo.springchatapp.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String sender;
    private String receiver;
    private String message;
    private String date;
}
