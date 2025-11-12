package com.springforgame.springboota3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message;


    public Messages(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Messages() {

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Messages messages = (Messages) o;
        return Objects.equals(id, messages.id) && Objects.equals(message, messages.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }
}
