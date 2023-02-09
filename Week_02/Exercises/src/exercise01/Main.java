package exercise01;
public class Main {

    public static void main(String args[]) {

        Wheel mtbWheel = new Wheel("Presta",406, 19, "mm");
        MountainBike mtb1 = new MountainBike("B'TWIN", 60, "km/h", mtbWheel, 5);

        mtb1.checkBikeSafety();

    }
}