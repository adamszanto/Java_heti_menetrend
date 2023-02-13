package exercise14;

public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String name, String model, int year, int numberOfDoors) {
        super(name, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
