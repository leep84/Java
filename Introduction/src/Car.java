public class Car {
    static int counter;
    String colour;
    int numberOfDoors;
    boolean hasAirbags;
    String fuelType;

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", hasAirbags=" + hasAirbags +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public Car(String colour, int numberOfDoors, boolean hasAirbags, String fuelType) {
        counter++;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.hasAirbags = hasAirbags;
        this.fuelType = fuelType;

    }
    public String getColour() {
        return colour;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isHasAirbags() {
        return hasAirbags;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

}
