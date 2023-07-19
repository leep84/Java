package org.example;

public class Motorbike extends Vehicle {
    String bikeType;

    public Motorbike(boolean hasEngine, int numberOfSeats, int numberOfWheels, String fuelType, String bikeType) {
        super(hasEngine, numberOfSeats, numberOfWheels, fuelType);
        this.bikeType = bikeType;
    }

    public Motorbike() {
        super();
    }
}
