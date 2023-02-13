package exercise12;

public class Laptop extends Computer{
    private int batteryCapacitymAh;

    public Laptop(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard, int batteryCapacitymAh) {
        super(processor, memory, storage, graphicsCard);
        this.batteryCapacitymAh = batteryCapacitymAh;
    }

    public int getBatteryCapacitymAh() {
        return batteryCapacitymAh;
    }

    public void setBatteryCapacitymAh(int batteryCapacitymAh) {
        this.batteryCapacitymAh = batteryCapacitymAh;
    }
}
