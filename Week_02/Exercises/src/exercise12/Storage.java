package exercise12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storage storage = (Storage) o;

        if (storageGB != storage.storageGB) return false;
        if (!Objects.equals(manufacturer, storage.manufacturer))
            return false;
        return Objects.equals(type, storage.type);
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + storageGB;
        return result;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", storageGB=" + storageGB +
                '}';
    }
}
