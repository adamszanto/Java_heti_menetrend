package exercise14;

public class Train extends Vehicle {
    private int numberOfPassengers;
    public Train(String name, String model, int year, int numberOfPassengers) {
        super(name, model, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
