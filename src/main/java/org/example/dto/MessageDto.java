package org.example.dto;

import lombok.*;

import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageDto {
    private String message;
    private Long senderId;
    private Long recipientId;
}
