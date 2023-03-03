package Exercise_00StreamAPI_exercise;

public class Shop implements Comparable<Shop> {
    private final String name;
    private final int area;

    public Shop(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Shop{}";
    }

    @Override
    public int compareTo(Shop o) {
        return this.getArea() - o.getArea();
    }
}
