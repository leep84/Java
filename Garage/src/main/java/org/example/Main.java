package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car tesla = new Car(true,5,4,"electric", true, 5);
        Car delBoy = new Car(true,2,3,"petrol", false,3);
        Motorbike moped = new Motorbike(true,1,2,"Diesel", "naff");
        Bike bike = new Bike(false,1,2,"pedal power", true);

        Garage.addToGarage(tesla);
        Garage.addToGarage((moped));
        Garage.addToGarage((delBoy));
        Garage.addToGarage(bike);

        Garage.displayGarage();

        Garage.billing();

    }

}