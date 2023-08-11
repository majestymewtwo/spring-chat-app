package com.mewtwo.springchatapp.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String senderEmail;
    private String message;
    private String date;
}
