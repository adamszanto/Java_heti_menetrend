package exercise00;

public class Hero implements Comparable<Hero>{
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

    @Override
    public int compareTo(Hero o) {
        return name.compareTo(o.name);
    }
}
