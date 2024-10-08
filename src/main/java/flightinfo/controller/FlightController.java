package flightinfo.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import flightinfo.model.Flight;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FlightController {

    @GetMapping("/")
    public String home() {
        return "Velkommen til Flights API!";
    }

    @GetMapping("/flights")
    public List<Flight> getFlights() {

        return Arrays.asList(
                new Flight("13:00", "A321", "Lillestrøm", "On Time", "D32"),
                new Flight("14:00", "A320", "Tromsø", "Delayed", "B3"),
                new Flight("15:00", "A319", "Halden", "On Time", "A5"));
    }

}
