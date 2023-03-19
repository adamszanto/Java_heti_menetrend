package org.example.model;

import java.util.ArrayList;

public class HeroList {
    private static ArrayList<Hero> heroes;

    public void add(Hero hero) {
        heroes.add(hero);
    }

    @Override
    public String toString() {
        return "HeroList{" +
                "heroes=" + heroes +
                '}';
    }
}
