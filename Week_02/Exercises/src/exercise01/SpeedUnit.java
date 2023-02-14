package exercise01;

public class SpeedUnit {
    private int speedValue;
    private Dimension speedDimension;

    public SpeedUnit(int speedValue, Dimension speedDimension) {
        this.speedValue = speedValue;
        this.speedDimension = speedDimension;
    }

    @Override
    public String toString() {
        return "SpeedUnit{" +
                "speedValue=" + speedValue
                 + speedDimension +
                '}';
    }
}
