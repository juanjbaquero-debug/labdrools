package com.udea.labdrools.model;

public class Flight {
    private String flightNumber;
    private int delayMinutes;
    private double durationHours;
    private boolean emergencySeatAvailable;

    public Flight() {}

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public int getDelayMinutes() { return delayMinutes; }
    public void setDelayMinutes(int delayMinutes) { this.delayMinutes = delayMinutes; }
    public double getDurationHours() { return durationHours; }
    public void setDurationHours(double durationHours) { this.durationHours = durationHours; }
    public boolean isEmergencySeatAvailable() { return emergencySeatAvailable; }
    public void setEmergencySeatAvailable(boolean emergencySeatAvailable) { this.emergencySeatAvailable = emergencySeatAvailable; }
}