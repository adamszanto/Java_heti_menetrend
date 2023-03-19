package org.example;

// TODO: A MVP esetében
//  a View ismeri a Presentert
//  a Presenter ismeri a Viewt és a Modelt
//  a Model ismeri a Presentert.

import org.example.hero.model.Text;
import org.example.hero.presenter.HeroPresenter;
import org.example.hero.presenter.Presenter;
import org.example.hero.view.Window;

public class Main {
    public static void main(String[] args) {

        Text text = new Text();
        Window window = new Window();
        HeroPresenter heroPresenter = new HeroPresenter(window, text);
        text.setPresenter(heroPresenter);
        window.setPresenter(heroPresenter);
    }
}