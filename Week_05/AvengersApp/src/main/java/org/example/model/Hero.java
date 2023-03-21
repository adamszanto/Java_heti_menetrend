package org.example.model;

import org.example.presenter.Presenter;

import java.util.HashMap;
import java.util.Map;

public class Hero implements Model {
    private Map<String, String> heroes;
    private Presenter presenter;

    public Hero() {
        this.heroes = new HashMap<>();
    }

    public void add(String heroName, String heroPower) {

    }

    public Map<String, String> getHeroes() {
        return heroes;
    }

    public void setHeroes(Map<String, String> heroes) {
        this.heroes = heroes;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroes=" + heroes +
                '}';
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void createHero(String name, String power) {
        heroes.put(name, power);
    }

    @Override
    public int getHeroesSize() {
        return heroes.size();
    }
}