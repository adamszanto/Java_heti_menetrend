package exercise14;

public class Bus extends Vehicle{
    private boolean hasCashRegister;
    private Fare fare;
    public Bus(String name, String model, int year, boolean hasCashRegister, Fare fare) {
        super(name, model, year);
        this.hasCashRegister = hasCashRegister;
        this.fare = fare;
    }

    public boolean isHasCashRegister() {
        return hasCashRegister;
    }

    public void setHasCashRegister(boolean hasCashRegister) {
        this.hasCashRegister = hasCashRegister;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }
}
