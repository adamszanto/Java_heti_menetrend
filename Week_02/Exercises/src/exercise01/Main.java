package exercise01;
public class Main {

    public static void main(String args[]) {

        SpeedUnit speed1 = new SpeedUnit(120, Dimension.KPH);
        Wheel mtbWheel = new Wheel("Presta",406, 19, "mm");
        Bike mtb1 = new MountainBike("B'TWIN", 60, speed1, mtbWheel, 5);

        System.out.println(mtb1);
        mtb1.checkBikeSafety();

    }
}