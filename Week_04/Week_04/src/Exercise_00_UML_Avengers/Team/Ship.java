package Exercise_00_UML_Avengers.Team;
import Exercise_00_UML_Avengers.Hero.Hero;

import java.util.LinkedList;
import java.util.List;

public class Ship {
    private final List<Hero> listOfHeroes;

    public Ship() {
        this.listOfHeroes = new LinkedList<>();
    }

    public boolean addHero(Hero hero) {

        if(listOfHeroes.size() < 4) {
            listOfHeroes.add(hero);
            System.out.println(hero.getName() + " added to the ship!");
            return true;
        } else {
            System.out.println("This ship is full.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "listOfHeroes=" + listOfHeroes +
                '}';
    }
}
