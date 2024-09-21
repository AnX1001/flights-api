package com.example.springpostgres.controller;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import com.example.springpostgres.entity.Passenger;
import com.example.springpostgres.logic.PassengerLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private PassengerLogic passengerLogic;

    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping()
    @ResponseBody()
    public List<Passenger> allPassengers(){
        return passengerLogic.getAllPassengers();
    }

    // Additional endpoints and logic can be added here
     @CrossOrigin(origins = "http://localhost:3000")
     @GetMapping("/database-health")
    public String checkDatabase() {
        try (Connection connection = dataSource.getConnection()) {
            // If connection is successful, return success message
            return "Database is up and running!";
        } catch (SQLException e) {
            // If connection fails, return an error message
            e.printStackTrace();
            return "Database connection error: " + e.getMessage() + " Possible causes: issues with database connection or executing database queries. Origin: DatabaseController."; //Propagates to the frontend to the database chip status
        }
    }
}
