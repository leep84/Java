package org.example;

public class Bike extends Vehicle{
    boolean hasABell;
    public Bike(boolean hasEngine, int numberOfSeats, int numberOfWheels, String fuelType, boolean hasABell) {
        super(hasEngine, numberOfSeats, numberOfWheels, fuelType);
        this.hasABell = hasABell;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "hasABell=" + hasABell +
                ", hasEngine=" + hasEngine +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
