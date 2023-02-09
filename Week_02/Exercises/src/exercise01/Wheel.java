package exercise01;

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
}
