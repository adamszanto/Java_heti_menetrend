package exercise12;

public class GraphicsCard {
    private String manufacturer;
    private String type;
    private int memoryCapacityGB;

    public GraphicsCard(String manufacturer, String type, int memoryCapacityGB) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.memoryCapacityGB = memoryCapacityGB;
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

    public int getMemoryCapacityGB() {
        return memoryCapacityGB;
    }

    public void setMemoryCapacityGB(int memoryCapacityGB) {
        this.memoryCapacityGB = memoryCapacityGB;
    }
}
