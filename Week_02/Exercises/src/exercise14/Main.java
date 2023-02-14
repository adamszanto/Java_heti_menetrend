package exercise14;

import exercise05.Laptop;

public class Main {
    public static void main(String[] args) {
        BusStop busStop1 = new BusStop("Petofi ter", true);
        BusStop busStop2 = new BusStop("Deak ter", true);
        Fare line1 = new Fare();
        line1.add(busStop1);
        line1.add(busStop2);

        Vehicle bus1 = new Bus("Ikarus","C200",1983, true, line1);


        if(bus1 instanceof Bus) {
            Bus bus2 = (Bus) bus1;
            System.out.println("$" + bus2.getFare().getFareCost());
        }
    }
}
