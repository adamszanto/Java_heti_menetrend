package exercise03;

import java.util.ArrayList;
import java.util.Objects;

public class Window {
    private double width;
    private double height;
    private final String dimension = "mm";
    private ArrayList<Door> doors;
    private ArrayList<Window> windows;


    public Window(double width, double height) {
        this.width = width;
        this.height = height;
        doors = new ArrayList<>();
        windows = new ArrayList<>();
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (Double.compare(window.width, width) != 0) return false;
        if (Double.compare(window.height, height) != 0) return false;
        if (dimension != null ? !dimension.equals(window.dimension) : window.dimension != null) return false;
        if (!Objects.equals(doors, window.doors)) return false;
        return Objects.equals(windows, window.windows);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dimension != null ? dimension.hashCode() : 0);
        result = 31 * result + (doors != null ? doors.hashCode() : 0);
        result = 31 * result + (windows != null ? windows.hashCode() : 0);
        return result;
    }
}
