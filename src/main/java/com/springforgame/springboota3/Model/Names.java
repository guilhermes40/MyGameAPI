package com.springforgame.springboota3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Names {
    @Id
    private Integer id;
    private String first_name;
    private String last_name;
    private String full_name;


    public Names(Integer id, String first_name, String last_name, String full_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.full_name = full_name;
    }

    public Names() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return Objects.equals(id, names.id) && Objects.equals(first_name, names.first_name) && Objects.equals(last_name, names.last_name) && Objects.equals(full_name, names.full_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, full_name);
    }
}
