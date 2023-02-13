package exercise12;

public class Memory {
    private String manufacturer;
    private String type;
    private int memoryGB;

    public Memory(String manufacturer, String type, int memoryGB) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.memoryGB = memoryGB;
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

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }
}
