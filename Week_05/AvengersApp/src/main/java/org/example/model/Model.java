package org.example.model;

import org.example.presenter.Presenter;

public interface Model {
    public void setPresenter(Presenter presenter);

    public void createHero(String name, String power);
    public int getHeroesSize();
}