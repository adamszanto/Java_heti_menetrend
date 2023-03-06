package Exercise_00_UML_Avengers.Hero;

import Exercise_00_UML_Avengers.InfinityStone;

public abstract class Hero {
    private final String name;
    private final Integer power;
    private final InfinityStone stone;

    public Hero(String name, Integer power, String stone) {
        this.name = name;
        this.power = power;
        this.stone = InfinityStone.getTimeStone();
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
