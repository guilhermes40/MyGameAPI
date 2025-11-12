package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Emails;
import com.springforgame.springboota3.Model.Messages;
import com.springforgame.springboota3.Repository.MessageRepository;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesService {
    private MessageRepository messageRepository;

    //contructor
    public MessagesService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    //getAllMessages
    public List<Messages> getAllMessages() {
        return messageRepository.findAll();
    }
    //getByIdMessage
    public Messages getMessagesById(int id) {
        return messageRepository.findById(id).get();
    }

    //postNewMessage
    public void  AddNewMessage(Messages messages){
        messageRepository.save(messages);
    }

    //putEmail
    public void UpdateMessage(int id, Messages messages){
        Messages currentMessage =  messageRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Message not fond"));
        currentMessage.setMessage(messages.getMessage());
        messageRepository.save(currentMessage);
    }
    //deleteMessageById
    public void DeleteMessageById(int id){
        messageRepository.deleteById(id);
    }
    
}
