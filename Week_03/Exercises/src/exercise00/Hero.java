package exercise00;

public class Hero {
    private final String name;
    private final int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    public String getName() {
        return name;
    }

}
