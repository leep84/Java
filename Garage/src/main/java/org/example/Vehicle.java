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

    @Override
    public String toString() {
        return "Vehicle{" +
                "hasEngine=" + hasEngine +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

}
