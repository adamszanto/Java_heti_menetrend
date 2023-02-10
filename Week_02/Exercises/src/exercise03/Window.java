package exercise03;

import java.util.ArrayList;

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
}
