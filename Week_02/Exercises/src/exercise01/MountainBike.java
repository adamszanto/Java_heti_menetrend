package exercise01;

public class MountainBike extends Bike {
    private int numGear;

    public MountainBike(String brand, int speed, SpeedUnit speedUnit, Wheel wheelType, int numGear) {
        super(brand, speed, speedUnit, wheelType);
        this.numGear = numGear;
    }

    @Override
    public void checkBikeSafety() {
        System.out.println(this.getClass().getSimpleName() + " has been checked. Brakes, wheel, lights, helmet are OK.");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MountainBike that = (MountainBike) o;

        return numGear == that.numGear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numGear;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "MountainBike{" +
                "numGear=" + numGear +
                '}';
    }

    // TODO: equalsHashCode, toString implementálni. Ha nincs az őshöz képest plusz attribútum akkor elég a toString...
}
