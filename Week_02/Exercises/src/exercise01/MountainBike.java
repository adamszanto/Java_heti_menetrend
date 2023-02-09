package exercise01;

public class MountainBike extends Bike {
    private int numGear;

    public MountainBike(String brand, int speed, String speedDimension, Wheel wheelType, int numGear) {
        super(brand, speed, speedDimension, wheelType);
        this.numGear = numGear;
    }

    @Override
    public void checkBikeSafety() {
        System.out.println(this.getClass().getSimpleName() + " has been checked. Brakes, wheel, lights, helmet are OK.");
    }
}
