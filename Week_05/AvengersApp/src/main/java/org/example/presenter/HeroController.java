package org.example.presenter;

import org.example.model.Hero;
import org.example.model.Model;
import org.example.view.View;

import java.io.IOException;
import java.util.List;

public class HeroController implements Presenter {

    private final Model model;
    private final View view;

    public HeroController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void createHero(String name, String power) {
        model.createHero(name, Integer.parseInt(power));
    }

    @Override
    public void saveHeroes() {
        try {
            model.exportHero();
            view.notifyExport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void handleModelChanged() {
        List<Hero> heroes = model.getHeroes();
        view.updateView(heroes.toString());
    }
}