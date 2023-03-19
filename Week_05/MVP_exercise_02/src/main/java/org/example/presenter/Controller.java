package org.example.presenter;

import org.example.model.Model;
import org.example.view.View;

public class Controller implements Presenter {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void updateValue(String value) {
        model.updateModel(value + " rewritten");
    }


    @Override
    public void triggerValueUpdated() {
        view.updateValue(model.getValue());
    }
}
