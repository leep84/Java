package org.example;

public class Car extends Vehicle{

    boolean hasAirBags;
    int numberOfDoors;
    public Car(boolean hasEngine, int numberOfSeats, int numberOfWheels, String fuelType, boolean hasAirBags, int numberOfDoors) {
        super(hasEngine, numberOfSeats, numberOfWheels, fuelType);
        this.hasAirBags = hasAirBags;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasAirBags=" + hasAirBags +
                ", numberOfDoors=" + numberOfDoors +
                ", hasEngine=" + hasEngine +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}

