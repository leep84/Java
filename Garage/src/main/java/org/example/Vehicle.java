package org.example;

public class Vehicle {
    boolean hasEngine;
    int numberOfSeats;
    int numberOfWheels;
    String fuelType;

    public Vehicle(boolean hasEngine, int numberOfSeats, int numberOfWheels, String fuelType){
        this.hasEngine = hasEngine;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }

    public Vehicle() {

    }
}
