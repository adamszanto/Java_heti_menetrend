package org.example;

import org.example.model.Hero;
import org.example.presenter.HeroController;
import org.example.view.Window;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Window window = new Window();
        HeroController controller = new HeroController(hero, window);
        hero.setPresenter(controller);
        window.setPresenter(controller);


        // User beír nevet és erő értéket
        // View küldi Controllernek hogy új hős kell
        // Presenter küldi a Modelbe az új hőst
        // Model szól a Presenternek hogy kész
        // Presenter szól View-nek hogy kész
    }
}