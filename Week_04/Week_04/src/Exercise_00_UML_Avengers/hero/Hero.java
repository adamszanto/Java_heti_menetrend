package Exercise_00_UML_Avengers.hero;

import Exercise_00_UML_Avengers.InfinityStone;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (!Objects.equals(name, hero.name)) return false;
        if (!Objects.equals(power, hero.power)) return false;
        return Objects.equals(stone, hero.stone);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (stone != null ? stone.hashCode() : 0);
        return result;
    }
}
