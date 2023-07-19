package org.example;

public class Bike extends Vehicle{
    boolean hasABell;
    public Bike(boolean hasEngine, int numberOfSeats, int numberOfWheels, String fuelType, boolean hasABell) {
        super(hasEngine, numberOfSeats, numberOfWheels, fuelType);
        this.hasABell = hasABell;
    }
}
