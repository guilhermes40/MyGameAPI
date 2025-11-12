package com.springforgame.springboota3.Controller;

import com.springforgame.springboota3.Model.Emails;
import com.springforgame.springboota3.Service.EmailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/emails")
public class EmailsController {

        private EmailsService emailsService;

    public EmailsController(EmailsService emailsService) {
        this.emailsService = emailsService;
    }

    @GetMapping
    public List<Emails> GetEmails(){
        return emailsService.GetAllEmail();
    }

    @GetMapping("{id}")
    public Emails GetEmail(@PathVariable int id){
        return emailsService.GetEmailById(id);
    }


}
