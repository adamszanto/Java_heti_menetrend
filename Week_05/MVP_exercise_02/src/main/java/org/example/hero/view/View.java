package org.example.hero.view;

import org.example.hero.presenter.Presenter;

public interface View {
    public void setPresenter(Presenter presenter);
    public void updatedValue(String value);
}
