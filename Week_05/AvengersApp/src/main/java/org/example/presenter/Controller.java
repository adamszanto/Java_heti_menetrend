package org.example.presenter;

import org.example.model.Model;
import org.example.view.View;

public class Controller implements Presenter{
    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void updateValue(String value) {
        model.updateModel(value + " rewritten.");
    }

    @Override
    public void triggerValueUpdated() {
        view.updateValue(model.getValue());
    }
}
