package Exercise_00_UML_Avengers;

public abstract class Hero {
    private final String name;
    private final Integer power;
    private final InfinityStone stone;

    public Hero(String name, Integer power, InfinityStone stone) {
        this.name = name;
        this.power = power;
        this.stone = stone;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    public InfinityStone getStone() {
        return stone;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", stone=" + stone +
                '}';
    }
}
