package org.example.model;

import java.util.Objects;

public class Hero {
    private final String name;
    private int power;

    public Hero(String name, int power) {
        this. name = name;
        if(power > 10) {
            this.power = 10;
        } else if(power < 1) {
            this.power = 1;
        } else {
            this.power = power;
        }
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (power != hero.power) return false;
        return Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + power;
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
