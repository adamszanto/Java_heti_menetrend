package exercise12;

public class Laptop extends Computer{
    private final int batteryCapacitymAh;

    public Laptop(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard, int batteryCapacitymAh) {
        super(processor, memory, storage, graphicsCard);
        this.batteryCapacitymAh = batteryCapacitymAh;
    }

    public int getBatteryCapacitymAh() {
        return batteryCapacitymAh;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Laptop laptop = (Laptop) o;

        return batteryCapacitymAh == laptop.batteryCapacitymAh;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + batteryCapacitymAh;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacitymAh=" + batteryCapacitymAh +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop has turned on.");
    }
}
