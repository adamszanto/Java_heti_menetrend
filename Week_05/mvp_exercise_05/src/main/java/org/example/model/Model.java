package org.example.model;

import org.example.presenter.Presenter;

public interface Model {
    public void setPresenter(Presenter presenter);
    public void generateHero(String name, int power);
    public String getName();
    public Integer getPower();

}
