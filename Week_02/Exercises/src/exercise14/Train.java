package exercise14;

public class Train extends Vehicle {
    private final int numberOfPassengers;
    public Train(String name, String model, int year, int numberOfPassengers) {
        super(name, model, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Train train = (Train) o;

        return numberOfPassengers == train.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfPassengers;
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
