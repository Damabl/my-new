package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.MessageDto;
import org.example.entity.Message;
import org.example.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;
    private final UsersService usersService;
    public String addMessage(MessageDto messageDto){
        Message message=new Message();
        if(!messageDto.getMessage().isBlank()||messageDto.getMessage()!=null){
            return "message is empty";
        }
        message.setMessage(messageDto.getMessage());
        message.setTimeofSend(messageDto.getTimeofSend());
        message.setRecipientId(usersService.getUserById(messageDto.getUser_recipient()));
        message.setSenderId(usersService.getUserById(messageDto.getUser_sender()));
        messageRepository.save(message);
        return "added";
    }
    public List<Message> getAllMessage(){
        return messageRepository.findAll();
    }

}
