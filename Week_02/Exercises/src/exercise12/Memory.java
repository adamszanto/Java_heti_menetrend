package exercise12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Memory memory = (Memory) o;

        if (memoryGB != memory.memoryGB) return false;
        if (!Objects.equals(manufacturer, memory.manufacturer))
            return false;
        return Objects.equals(type, memory.type);
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + memoryGB;
        return result;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", memoryGB=" + memoryGB +
                '}';
    }
}
