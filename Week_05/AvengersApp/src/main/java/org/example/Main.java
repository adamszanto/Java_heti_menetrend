package org.example;

import org.example.model.HeroDao;
import org.example.model.HeroStore;
import org.example.model.Model;
import org.example.presenter.HeroController;
import org.example.presenter.Presenter;
import org.example.view.Console;
import org.example.view.View;
import org.example.view.Window;

// TODO: Nagy avengerses kód. Fölvesszük a Hero-kat. A DB-be tárolódik le olyankor. Ha report kell vagy valami, akkor a db-ből olvassuk ki.
// TODO: Ship, Fleet nem kell, a report úgy alakítsam át hogy ne legyen köze se shiphez, se fleethez. Csak a Heroval legyen kapcsolatos
public class Main {
    public static void main(String[] args) {
    //    Model hero = new HeroDao();
        Model hero = new HeroStore();
        View window = new Window();
       // Console window = new Console();
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