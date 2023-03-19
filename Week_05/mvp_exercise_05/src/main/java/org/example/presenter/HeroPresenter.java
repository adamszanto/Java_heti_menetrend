package org.example.presenter;

import org.example.model.Model;
import org.example.view.View;

public class HeroPresenter implements Presenter {
    private final View view;
    private final Model model;

    public HeroPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void createHero() {
        model.generateHero(model.getName(), model.getPower());
    }
}
