package exercise12;

import java.util.Objects;

public class GraphicsCard {
    private final String manufacturer;
    private final String type;
    private final int memoryCapacityGB;

    public GraphicsCard(String manufacturer, String type, int memoryCapacityGB) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.memoryCapacityGB = memoryCapacityGB;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String getType() {
        return type;
    }


    public int getMemoryCapacityGB() {
        return memoryCapacityGB;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphicsCard that = (GraphicsCard) o;

        if (memoryCapacityGB != that.memoryCapacityGB) return false;
        if (!Objects.equals(manufacturer, that.manufacturer)) return false;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + memoryCapacityGB;
        return result;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", memoryCapacityGB=" + memoryCapacityGB +
                '}';
    }
}
