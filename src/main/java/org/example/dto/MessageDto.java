package org.example.dto;

import lombok.*;

import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageDto {
    private LocalDateTime timeofSend;
    private String message;
    private Long user_sender;
    private Long user_recipient;
}
