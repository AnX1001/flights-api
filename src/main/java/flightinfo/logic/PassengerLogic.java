package com.example.springpostgres.logic;

import com.example.springpostgres.dao.PassengerRepository;
import com.example.springpostgres.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerLogic {

    @Autowired
    private PassengerRepository passengerRepository;

 public List<Passenger> getAllPassengers() {

        try {
            return passengerRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to fetch passengers: " + e.getMessage());
        }
    }

    // You can add more methods here as needed
}