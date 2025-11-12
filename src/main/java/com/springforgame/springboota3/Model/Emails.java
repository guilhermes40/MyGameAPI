package com.springforgame.springboota3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Emails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;

    public Emails(Integer id, String email) {
        this.id = id;
        this.email = email;
    }

    public Emails() {

    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emails emails = (Emails) o;
        return Objects.equals(id, emails.id) && Objects.equals(email, emails.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
