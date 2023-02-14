package exercise02;

// Tervezéskor el lehet dönteni, hogy lesz-e speciális esete az osztálynak? Ha nem, akkor finalt érdemes...
public final class GraphicsCard {
    private final String manufacturer;
    private final String model;
    private final int memorySizeGB;
    private final String memoryType;

    public GraphicsCard(String manufacturer, String model, int memorySize, String memoryType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.memorySizeGB = memorySize;
        this.memoryType = memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getMemorySizeGB() {
        return memorySizeGB;
    }
    public String getMemoryType() {
        return memoryType;
    }

    // TODO: equalsHashCode & toString implementálni mert nem tároló jellegű funkciót tölt be elsődlegesen.

}
