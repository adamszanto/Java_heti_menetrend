package org.example.model;

import org.example.presenter.Presenter;

public class Text implements Model{
    private String value = new String();
    private Presenter presenter;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateModel(String value) {
        this.value = value;
        presenter.triggerValueUpdated();
    }

    @Override
    public String getValue() {
        return value;
    }
}