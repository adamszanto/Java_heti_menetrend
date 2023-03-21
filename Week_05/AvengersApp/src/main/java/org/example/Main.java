package org.example;

import org.example.model.HeroStore;
import org.example.model.Model;
import org.example.presenter.HeroController;
import org.example.presenter.Presenter;
import org.example.view.Console;
import org.example.view.View;
import org.example.view.Window;

public class Main {
    public static void main(String[] args) {
        Model hero = new HeroStore();
        View window = new Window();
        Presenter controller = new HeroController(hero, window);
        hero.setPresenter(controller);
        window.setPresenter(controller);
        window.start();

        // User beír nevet és erő értéket
        // View küldi Controllernek hogy új hős kell
        // Presenter küldi a Modelbe az új hőst
        // Model szól a Presenternek hogy kész
        // Presenter szól View-nek hogy kész
    }
}