package exercise01;

import java.util.Objects;

public class Wheel {
    private String hoseType;
    private int size;
    private int width;
    private String dimension;

    public Wheel(String hoseType, int size, int width, String dimension) {
        this.hoseType = hoseType;
        this.size = size;
        this.width = width;
    }

    public String getHoseType() {
        return hoseType;
    }

    public void setHoseType(String hoseType) {
        this.hoseType = hoseType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheel [" + "hoseType='" + hoseType + ", size=" + size + ", width=" + width + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        if (size != wheel.size) return false;
        if (width != wheel.width) return false;
        if (!Objects.equals(hoseType, wheel.hoseType)) return false;
        return Objects.equals(dimension, wheel.dimension);
    }

    @Override
    public int hashCode() {
        int result = hoseType != null ? hoseType.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + width;
        result = 31 * result + (dimension != null ? dimension.hashCode() : 0);
        return result;
    }
}
