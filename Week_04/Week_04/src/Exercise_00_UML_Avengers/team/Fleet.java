package Exercise_00_UML_Avengers.team;

import java.util.LinkedList;
import java.util.List;

// TODO:

public class Fleet {
    private final List<Ship> ships;

    public Fleet(List<Ship> listOfShips) {
        this.ships = new LinkedList<>();
    }

    public boolean addShip(Ship ship) {
        ships.add(ship);
        return true;
    }
}
