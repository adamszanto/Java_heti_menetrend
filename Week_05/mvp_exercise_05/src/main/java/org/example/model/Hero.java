package org.example.model;

import org.example.presenter.Presenter;

import java.util.Objects;

public class Hero implements Model {
    private Presenter presenter;
    private final String name;
    private final int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
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

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void generateHero(String name, int power) {
        HeroList heroList = new HeroList();
        heroList.add(new Hero(name, power));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPower() {
        return power;
    }
}
