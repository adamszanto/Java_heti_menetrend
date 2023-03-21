package org.example.model;

import org.example.presenter.Presenter;

import java.util.List;

public class HeroDao implements Model{
    private Presenter presenter;
    private static final String url = null;
    private static final String username = null;
    private static final String password =  null;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    // TODO: PreparedStatement
    // TODO: Heroes tábla (name, power) oszlop
    // TODO: Nincs primary key most
    @Override
    public void createHero(String name, Integer power) {
        String sql = "INSERT INTO heroes(name, power) VALUES(?,?)";

    }

    @Override
    public List<Hero> getHeroes() {
        return null;
    }
}
