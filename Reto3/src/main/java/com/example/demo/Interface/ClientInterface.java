package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Client;

public interface ClientInterface extends CrudRepository<Client, Integer> {

}
