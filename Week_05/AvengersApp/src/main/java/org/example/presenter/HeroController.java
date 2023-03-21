package org.example.presenter;

import org.example.model.Model;
import org.example.view.View;

public class HeroController implements Presenter {

    private final Model model;
    private final View view;

    public HeroController(Model model, View view) {
        this.model = model;
        this.view = view;
    }




    @Override
    public void createHero(String name, String power) {
        model.createHero(name, power);
    }

    @Override
    public int getHeroesSize() {
        return model.getHeroesSize();
    }
}