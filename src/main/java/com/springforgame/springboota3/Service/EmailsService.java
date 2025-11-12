package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Emails;
import com.springforgame.springboota3.Repository.EmailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailsService {
    private EmailsRepository emailsRepository;

    public EmailsService(EmailsRepository emailsRepository) {
        this.emailsRepository = emailsRepository;
    }

    public List<Emails> GetAllEmail(){
        return emailsRepository.findAll();
    }

    public Emails GetEmailById(int id){
        return emailsRepository.findById(id).get();
    }

}
