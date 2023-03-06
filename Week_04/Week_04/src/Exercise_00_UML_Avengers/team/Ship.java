package Exercise_00_UML_Avengers.team;
import Exercise_00_UML_Avengers.hero.Hero;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// TODO: PIPA A 4-es értéket kiemelni egy private static változóba MAXIMUM_NUM_SEATS vagy ilyesmi...
// TODO: PIPA Equals & hashCode még...
public class Ship {

    private static final int MAXIMUM_NUM_SEATS = 4;

    private final List<Hero> listOfHeroes;

    public Ship() {
        this.listOfHeroes = new LinkedList<>();
    }

    public boolean addHero(Hero hero) {

        if(listOfHeroes.size() < MAXIMUM_NUM_SEATS) {
            listOfHeroes.add(hero);
            System.out.println(hero.getName() + " added to the ship!");
            return true;
        } else {
            System.out.println("This ship is full.");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ship ship = (Ship) o;

        return Objects.equals(listOfHeroes, ship.listOfHeroes);
    }

    @Override
    public int hashCode() {
        return listOfHeroes != null ? listOfHeroes.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "listOfHeroes=" + listOfHeroes +
                '}';
    }
}
