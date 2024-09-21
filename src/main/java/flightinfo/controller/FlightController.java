package flightinfo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FlightController {

    @GetMapping("/")
    public String home() {
        return "Velkommen til Flights API!";
    }

    @GetMapping("/flights")
    public String flights() {
        return "Her er en liste over alle flyvninger.";
    }

}
