package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class HeroGenerator implements HeroModel {



    private List<Hero> heroes = new ArrayList<>();
    @Override
    public void addHero(String name, int power) {
        Hero hero = new Hero(name, power);
        heroes.add(hero);
    }

    @Override
    public ArrayList<Hero> getHeroes() {
        return (ArrayList<Hero>) heroes;
    }
}
