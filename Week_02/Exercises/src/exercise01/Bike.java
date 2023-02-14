package exercise01;

import java.util.Objects;

public abstract class Bike implements Safety {
    private final String brand;
    private final int speed;
    // TODO: dimenzió: ENUM-ként vegyem fel, ne Stringként...
    // TODO: speed és dimenziót egységbe zárni...
    // TODO: Ha nem tároló funkciót tölt be osztály akkor equalsHashCode és toString még implementálni...
    private final SpeedUnit speedUnit;
    private final Wheel wheelType;

    public Bike(String brand, int speed, SpeedUnit speedUnit, Wheel wheelType) {
        this.brand = brand;
        this.speed = speed;
        this.wheelType = wheelType;
        this.speedUnit = speedUnit;
    }

    public String getBrand() {
        return brand;
    }


    public int getSpeed() {
        return speed;
    }


    public Wheel getWheelType() {
        return wheelType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", speed=" + speedUnit +
                ", wheelType=" + wheelType +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (speed != bike.speed) return false;
        if (!Objects.equals(brand, bike.brand)) return false;
        if (!Objects.equals(speedUnit, bike.speedUnit)) return false;
        return Objects.equals(wheelType, bike.wheelType);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + speed;
        result = 31 * result + (speedUnit != null ? speedUnit.hashCode() : 0);
        result = 31 * result + (wheelType != null ? wheelType.hashCode() : 0);
        return result;
    }
}
