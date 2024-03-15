package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.entity.Users;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Users senderId;
    @ManyToOne
    private Users recipientId;
    @Column(name="message")
    private String message;
    @Column(name="timeofSend")
    private LocalDateTime timeofSend;
}
