package exercise05;

import java.util.Objects;

public abstract class Computer {
    private final String manufacturer;
    private final int ramSize;
    private final int diskSize;
    private final boolean hasSSD;
    private final boolean hasVGA;
    private final int numberOfUSBSlot;

    public Computer(String manufacturer, int ramSize, int diskSize, boolean hasSSD, boolean hasVGA, int numberOfUSBSlot) {
        this.manufacturer = manufacturer;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.hasSSD = hasSSD;
        this.hasVGA = hasVGA;
        this.numberOfUSBSlot = numberOfUSBSlot;
    }

    public void describeSpecs() {
        System.out.println("==============================");
        System.out.println("Manufacturer: " + manufacturer +".");
        System.out.println("RAM size: " + ramSize + "GB.");
        System.out.println("Disk size: " + diskSize + "GB.");
        if(hasVGA){
            System.out.println("It has dedicated VGA.");
        } else {
            System.out.println("VGA: Integrated.");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", hasSSD=" + hasSSD +
                ", hasVGA=" + hasVGA +
                ", numberOfUSBSlot=" + numberOfUSBSlot +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (ramSize != computer.ramSize) return false;
        if (diskSize != computer.diskSize) return false;
        if (hasSSD != computer.hasSSD) return false;
        if (hasVGA != computer.hasVGA) return false;
        if (numberOfUSBSlot != computer.numberOfUSBSlot) return false;
        return Objects.equals(manufacturer, computer.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + ramSize;
        result = 31 * result + diskSize;
        result = 31 * result + (hasSSD ? 1 : 0);
        result = 31 * result + (hasVGA ? 1 : 0);
        result = 31 * result + numberOfUSBSlot;
        return result;
    }
}
