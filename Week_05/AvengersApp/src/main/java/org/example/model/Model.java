package org.example.model;

import org.example.presenter.Presenter;

import java.util.List;

public interface Model {
    void setPresenter(Presenter presenter);

    void createHero(String name, Integer power);

    List<Hero> getHeroes();


}