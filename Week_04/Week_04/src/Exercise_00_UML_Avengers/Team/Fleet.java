package Exercise_00_UML_Avengers.Team;

import java.util.LinkedList;
import java.util.List;

public class Fleet {
    private final List<Ship> listOfShips;

    public Fleet(List<Ship> listOfShips) {
        this.listOfShips = new LinkedList<>();
    }

    public boolean addShip(Ship ship) {
        listOfShips.add(ship);
        return true;
    }
}
