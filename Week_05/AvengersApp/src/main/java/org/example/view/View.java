package org.example.view;

import org.example.presenter.Presenter;

public interface View {
    public void setPresenter(Presenter presenter);
    public void updateValue(String value);
}
