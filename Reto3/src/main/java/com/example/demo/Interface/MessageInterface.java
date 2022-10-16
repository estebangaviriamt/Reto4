package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Message;

public interface MessageInterface extends CrudRepository<Message, Integer> {

}
