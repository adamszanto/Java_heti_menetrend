package org.example.hero.presenter;

import org.example.hero.model.Model;
import org.example.hero.view.View;

public class HeroPresenter implements Presenter {
    private final View view;
    private final Model model;

    public HeroPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void updateValue(String value) {
        model.updateValue(value + " rewritten.");
    }

    @Override
    public void triggerValueUpdated() {
        view.updatedValue(model.getValue());
    }
}
