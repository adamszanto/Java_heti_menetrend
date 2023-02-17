package exercise12;

import java.util.Objects;

public class Processor  {
    private String manufacturer;
    private String type;
    private int numberOfCores;
    private double gigaHertz;

    public Processor(String manufacturer, String type, int numberOfCores, double gigaHertz) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.numberOfCores = numberOfCores;
        this.gigaHertz = gigaHertz;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getGigaHertz() {
        return gigaHertz;
    }

    public void setGigaHertz(double gigaHertz) {
        this.gigaHertz = gigaHertz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Processor processor = (Processor) o;

        if (numberOfCores != processor.numberOfCores) return false;
        if (Double.compare(processor.gigaHertz, gigaHertz) != 0) return false;
        if (!Objects.equals(manufacturer, processor.manufacturer))
            return false;
        return Objects.equals(type, processor.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + numberOfCores;
        temp = Double.doubleToLongBits(gigaHertz);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", gigaHertz=" + gigaHertz +
                '}';
    }
}
