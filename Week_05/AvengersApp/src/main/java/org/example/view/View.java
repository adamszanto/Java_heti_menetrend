package org.example.view;

import org.example.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void updateView(String heroes);
    void start();
    void notifyExport();

}