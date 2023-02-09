package exercise01;

public abstract class Bike implements Safety{
    private String brand;
    private int speed;
    private String speedDimension;
    private Wheel wheelType;

    public Bike(String brand, int speed, String speedDimension, Wheel wheelType) {
        this.brand = brand;
        this.speed = speed;
        this.speedDimension = speedDimension;
        this.wheelType = wheelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Wheel getWheelType() {
        return wheelType;
    }

    public void setWheelType(Wheel wheelType) {
        this.wheelType = wheelType;
    }

}
