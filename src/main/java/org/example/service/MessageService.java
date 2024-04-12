package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.MessageDto;
import org.example.entity.Message;
import org.example.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;
    private final UsersService usersService;

    public String addMessage(MessageDto messageDto) {
        Message message = new Message();

        if (messageDto.getMessage() == ""){
            return "Message is empty!";
        }


        message.setMessage(messageDto.getMessage());
        message.setTimeofSend(LocalDateTime.now());
        message.setRecipientId(usersService.getUserById(messageDto.getRecipientId()));
        message.setSenderId(usersService.getUserById(messageDto.getSenderId()));
        messageRepository.save(message);
        return "added";
    }

    public List<Message> getAllMessage() {
        return messageRepository.findAll();
    }

}