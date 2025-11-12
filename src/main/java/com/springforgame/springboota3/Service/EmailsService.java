package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Emails;
import com.springforgame.springboota3.Repository.EmailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailsService {
    private EmailsRepository emailsRepository;

    //constructor
    public EmailsService(EmailsRepository emailsRepository) {
        this.emailsRepository = emailsRepository;
    }
    //getAll
    public List<Emails> GetAllEmail(){
        return emailsRepository.findAll();
    }
    //getById
    public Emails GetEmailById(int id){
        return emailsRepository.findById(id).get();
    }
    //postEmail
    public void AddNewEmail(Emails emails){
        emailsRepository.save(emails);
    }
    //putEmail
    public void UpdateEmail(int id,Emails emails){
        Emails currentEmail =  emailsRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Email não encontrado"));
        currentEmail.setEmail(emails.getEmail());
        emailsRepository.save(currentEmail);
    }
    //deleteEmail
    public void DeleteEmailById(int id){
        emailsRepository.deleteById(id);
    }




}
