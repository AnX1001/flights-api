package flightinfo.model;

public class Flight {
    private String time;
    private String flightNumber;
    private String destination;
    private String status;

    public Flight(String time, String flight, String destination, String status) {
        this.time = time;
        this.flightNumber = flight;
        this.destination = destination;
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public String getFlight() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getStatus() {
        return status;
    }

}
