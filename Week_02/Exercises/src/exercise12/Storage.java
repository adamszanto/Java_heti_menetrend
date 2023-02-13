package exercise12;

public class Storage {
    private String manufacturer;
    private String type;
    private int storageGB;

    public Storage(String manufacturer, String type, int storageGB) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.storageGB = storageGB;
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

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }
}
