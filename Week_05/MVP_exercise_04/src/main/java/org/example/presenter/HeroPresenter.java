package org.example.presenter;

import org.example.model.Hero;
import org.example.view.HeroView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HeroPresenter {
    private HeroView view;
    private ArrayList<Hero> heroes;

    public HeroPresenter(HeroView view, ArrayList<Hero> heroes) {
        this.view = view;
        this.heroes = new ArrayList<Hero>();
    }

    public void generateHero(String name, int power) {
        heroes.add(new Hero(name, power));
    }

    public void saveHeroesToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(new File(filename));
            for(Hero hero : heroes) {
                writer.write(hero.getName() + ", " + hero.getPower() + "\n");
            }
            writer.close();
        } catch(IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
