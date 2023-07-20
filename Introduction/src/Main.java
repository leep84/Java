// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    System.out.println("Hello world");
    String phrase = "Hello World";
    System.out.println(phrase);
    System.out.println(helloWorld());

    Car myCar = new Car("red", 2, true,"rocket fuel");
    Car myOtherCar = new Car("blue", 2, false, "petrol");
    System.out.println(myCar);
    System.out.println(myOtherCar);
    System.out.println((myCar.getColour()));
    myOtherCar.setNumberOfDoors(5);
    System.out.println(myOtherCar);
    System.out.println("The number of cars created is " +Car.counter);
    }
    public static String helloWorld() {
        return "Hello World!!";
    }
}
