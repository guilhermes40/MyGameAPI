package com.springforgame.springboota3.Controller;


import com.springforgame.springboota3.Model.Messages;
import com.springforgame.springboota3.Service.EmailsService;
import com.springforgame.springboota3.Service.MessagesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/messages")
public class MessagesController {

    private MessagesService messagesService;

    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @GetMapping
    public List<Messages> getEmailsService() {
        return messagesService.getAllMessages();
    }

    @GetMapping("{id}")
    public Messages getMessages(@PathVariable int id){
        return messagesService.getMessagesById(id);
    }

    @PostMapping
    public void AddNewMessage(@RequestBody Messages messages){
        messagesService.AddNewMessage(messages);
    }

    @PutMapping("{id}")
    public void UpdateMessage(@PathVariable int id,@RequestBody Messages messages){
        messagesService.UpdateMessage(id, messages);
    }

    @DeleteMapping("{id}")
    public void deleteMessageById(@PathVariable int id){
        messagesService.DeleteMessageById(id);
    }

}
