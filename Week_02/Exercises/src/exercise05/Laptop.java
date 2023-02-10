package exercise05;

public class Laptop extends Computer{
    private int batteryCapacity;

    public Laptop(String manufacturer, int ramSize, int diskSize, boolean hasSSD, boolean hasVGA, int numberOfUSBSlot, int batteryCapacity) {
        super(manufacturer, ramSize, diskSize, hasSSD, hasVGA, numberOfUSBSlot);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void describeSpecs() {
        super.describeSpecs();
        System.out.println("Battery capacity is: " + batteryCapacity + "mAh");
    }
}
