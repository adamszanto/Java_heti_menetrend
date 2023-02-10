package exercise02;

public class Processor {
    private String manufacturer;
    private String model;
    private int core;

    public Processor(String manufacturer, String model, int core) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.core = core;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }


}
