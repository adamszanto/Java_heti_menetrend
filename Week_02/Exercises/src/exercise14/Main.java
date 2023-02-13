package exercise14;

public class Main {
    public static void main(String[] args) {
        BusStop busStop1 = new BusStop("Petofi ter", true);
        BusStop busStop2 = new BusStop("Deak ter", true);
        Fare line1 = new Fare();
        line1.add(busStop1);
        line1.add(busStop2);

        Bus bus1 = new Bus("Ikarus","C200",1983, true, line1);

        System.out.println("$" + bus1.getFare().getFareCost());

    }
}
