package com.springforgame.springboota3.Repository;

import com.springforgame.springboota3.Model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Messages, Integer> {
}
