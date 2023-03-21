package org.example.model;

import org.example.presenter.Presenter;

import java.util.*;

public class HeroStore implements Model {
    private List<Hero> heroes;
    private Presenter presenter;

    public HeroStore() {
        this.heroes = new ArrayList<>();
    }

    public void add(String heroName, String heroPower) {

    }



    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void createHero(String name, Integer power) {
        heroes.add(new Hero(name, power));
        presenter.handleModelChanged();
    }

    @Override
    public List<Hero> getHeroes() {
        return Collections.unmodifiableList(heroes);
    }

}