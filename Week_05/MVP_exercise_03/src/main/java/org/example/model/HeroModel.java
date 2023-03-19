package org.example.model;

import java.util.ArrayList;

public interface HeroModel {
    public void addHero(String name, int power);
    ArrayList<Hero> getHeroes();
}
