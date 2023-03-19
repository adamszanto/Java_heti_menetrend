package org.example.hero.model;

import org.example.hero.presenter.Presenter;

public class Text implements Model {
    private Presenter presenter;
    private String value = new String();


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateValue(String value) {
        this.value = value;
        presenter.triggerValueUpdated();
    }

    @Override
    public String getValue() {
        return value;
    }
}
