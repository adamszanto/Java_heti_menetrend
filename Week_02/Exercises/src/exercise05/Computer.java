package exercise05;

public abstract class Computer {
    private String manufacturer;
    private int ramSize;
    private int diskSize;
    private boolean hasSSD;
    private boolean hasVGA;
    private int numberOfUSBSlot;

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
}
