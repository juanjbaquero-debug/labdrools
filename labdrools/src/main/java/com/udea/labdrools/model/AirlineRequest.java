package com.udea.labdrools.model;

public class AirlineRequest {
    private Passenger passenger;
    private Flight flight;

    public AirlineRequest() {}

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }
    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
}