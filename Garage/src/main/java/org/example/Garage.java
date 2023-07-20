package org.example;

import java.util.Arrays;


import java.util.List;
import java.util.ArrayList;

public class Garage {


   public static ArrayList<Vehicle> garage = new ArrayList<>();
        public static void addToGarage(Vehicle v) {
              garage.add(v);


        }
        public static void displayGarage() {
                for (int i = 0; i < garage.size(); i++) {
                System.out.println(garage.get(i));
            }
        }

        public static void billing(){
                for (int i = 0; i < garage.size(); i++) {
                    if (garage.get(i) instanceof Car) {
                        System.out.println("The bill for this car is £100");
                    }
                    else if (garage.get(i) instanceof Motorbike) {
                        System.out.println("The bill for this motorbike is £75");
                    }
                    else if (garage.get(i) instanceof Bike) {
                        System.out.println("The bill for this bike is £40");
                    }
                }


        }


}


