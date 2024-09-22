package flightinfo.model;

public class Flight {
    private String time;
    private String flightNumber;
    private String destination;
    private String status;
    private String gate;

    public Flight(String time, String flightNumber, String destination, String status, String gate) {
        this.time = time;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.status = status;
        this.gate = gate;
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

    public String getGate() {
        return gate;
    }

}
