package exercise12;

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
}
