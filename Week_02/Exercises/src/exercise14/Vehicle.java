package exercise14;

import java.util.Objects;

public abstract class Vehicle {
    private final String name;
    private final String model;
    private int year;

    public Vehicle(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (year != vehicle.year) return false;
        if (!Objects.equals(name, vehicle.name)) return false;
        return Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
