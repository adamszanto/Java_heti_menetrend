package exercise03;

public class Door {
    private double width;
    private double height;
    private final String dimension = "mm";

    public Door(double width, double height) {
        this.width = width;
        this.height = height;
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
        return "Door{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
