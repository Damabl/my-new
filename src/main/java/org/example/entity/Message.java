package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JoinColumn(name="sender_id")
    private Users senderId;
    @ManyToOne
    @JoinColumn(name="recipient_id")
    private Users recipientId;
    @Column(name="message")
    private String message;
    @Column(name="timeofSend")
    private LocalDateTime timeofSend;
}
