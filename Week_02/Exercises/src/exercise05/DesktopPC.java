package exercise05;

public class DesktopPC extends Computer{
    private final String monitorManufacturer;
    private final int monitorColl;
    private final boolean keyboardAndMouse;

    public DesktopPC(String manufacturer, int ramSize, int diskSize, boolean hasSSD, boolean hasVGA, int numberOfUSBSlot, String monitorManufacturer, int monitorColl, boolean keyboardAndMouse) {
        super(manufacturer, ramSize, diskSize, hasSSD, hasVGA, numberOfUSBSlot);
        this.monitorManufacturer = monitorManufacturer;
        this.monitorColl = monitorColl;
        this.keyboardAndMouse = keyboardAndMouse;
    }

    @Override
    public void describeSpecs() {
        super.describeSpecs();
        if(keyboardAndMouse) {
            System.out.println("It has keyboard & mouse.");
        } else {
            System.out.println("Keyboard & mouse is not included.");
        }
    }
}
