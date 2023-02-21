package exercise14;

import java.util.Objects;

public class Bus extends Vehicle{
    private final boolean hasCashRegister;
    private final Fare fare;
    public Bus(String name, String model, int year, boolean hasCashRegister, Fare fare) {
        super(name, model, year);
        this.hasCashRegister = hasCashRegister;
        this.fare = fare;
    }

    public boolean isHasCashRegister() {
        return hasCashRegister;
    }

    public Fare getFare() {
        return fare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        if (hasCashRegister != bus.hasCashRegister) return false;
        return Objects.equals(fare, bus.fare);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hasCashRegister ? 1 : 0);
        result = 31 * result + (fare != null ? fare.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "hasCashRegister=" + hasCashRegister +
                ", fare=" + fare +
                '}';
    }
}
