package exercise00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Bal", 10);
        Hero hero2 = new Hero("Al", 15);

        List<Hero> heroes = Arrays.asList(hero1, hero2);
        Collections.sort(heroes, new HeroNameComparator());
        for(Hero h1 : heroes) {
            System.out.println(h1);
        }
    }
}