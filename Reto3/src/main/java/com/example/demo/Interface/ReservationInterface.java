package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Reservation;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {

}
