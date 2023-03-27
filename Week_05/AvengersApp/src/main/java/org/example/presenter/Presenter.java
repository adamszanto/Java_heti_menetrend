package org.example.presenter;

public interface Presenter {

    void createHero(String name, String power);
    void saveHeroes();
    void handleModelChanged();
}