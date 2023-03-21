package org.example.model;

import java.util.Objects;

public class Hero {
    private final String name;
    private final Integer power;

    public Hero(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (!Objects.equals(name, hero.name)) return false;
        return Objects.equals(power, hero.power);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (power != null ? power.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
