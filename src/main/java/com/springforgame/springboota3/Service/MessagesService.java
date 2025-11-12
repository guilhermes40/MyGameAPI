package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Messages;
import com.springforgame.springboota3.Repository.MessageRepository;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesService {
    private MessageRepository messageRepository;

    public MessagesService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    
    public List<Messages> getAllMessages() {
        return messageRepository.findAll();
    }

    public Messages getMessagesById(int id) {
        return messageRepository.findById(id).get();
    }
    
}
