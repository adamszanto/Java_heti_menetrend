package exercise02;

public class GraphicsCard {
    private String manufacturer;
    private String model;
    private int memorySizeGB;
    private String memoryType;

    public GraphicsCard(String manufacturer, String model, int memorySize, String memoryType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.memorySizeGB = memorySize;
        this.memoryType = memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(int memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }
}
