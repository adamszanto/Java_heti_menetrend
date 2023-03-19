package org.example.hero.model;
import org.example.hero.presenter.Presenter;

import java.util.Objects;

public abstract class Hero {
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
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (!Objects.equals(name, hero.name)) return false;
        if (!Objects.equals(power, hero.power)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (power != null ? power.hashCode() : 0);
        return result;
    }
}