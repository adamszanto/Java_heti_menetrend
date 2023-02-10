package exercise02;

public class Laptop {
    private String brand;
    private String model;
    private int stogareGB;
    private boolean hasSSD;
    private int memory;
    private int screenSizeInch;
    private Processor processor;
    private GraphicsCard graphicsCard;

    public Laptop(String brand, String model, int stogareGB, boolean hasSSD, int memory, int screenSizeInch, Processor processor, GraphicsCard graphicsCard) {
        this.brand = brand;
        this.model = model;
        this.stogareGB = stogareGB;
        this.hasSSD = hasSSD;
        this.memory = memory;
        this.screenSizeInch = screenSizeInch;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStogare() {
        return stogareGB;
    }

    public void setStogare(int stogare) {
        this.stogareGB = stogare;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", stogareGB=" + stogareGB + " GB" +
                ", hasSSD=" + hasSSD +
                ", memory=" + memory + " GB" +
                ", screenSizeInch=" + screenSizeInch +
                ", processor=" + processor.getModel() +
                ", graphics card =" + graphicsCard.getManufacturer() +
                '}';
    }
}
