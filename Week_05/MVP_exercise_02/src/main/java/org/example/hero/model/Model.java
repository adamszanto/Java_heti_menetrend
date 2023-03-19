package org.example.hero.model;

import org.example.hero.presenter.Presenter;

public interface Model {
    public void setPresenter(Presenter presenter);
    public void updateValue(String value);
    public String getValue();

}
