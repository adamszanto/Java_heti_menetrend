package exercise14;

import java.util.ArrayList;
import java.util.List;

public class Fare {
    private int fareCost;
    private List<Stop> fareStops;

    public Fare() {
        fareCost = 0;
        fareStops = new ArrayList<>();
    }

    public void add(Stop stop) {
        fareStops.add(stop);
        fareCost+=50;
    }

    public int getFareCost() {
        return fareCost;
    }

    public void setFareCost(int fareCost) {
        this.fareCost = fareCost;
    }

    public List<Stop> getFareStops() {
        return fareStops;
    }

    public void setFareStops(List<Stop> fareStops) {
        this.fareStops = fareStops;
    }

    @Override
    public String toString() {
        return "Fare{" +
                "fareCost=" + fareCost +
                ", fareStops=" + fareStops +
                '}';
    }
}
