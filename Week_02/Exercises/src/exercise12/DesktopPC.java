package exercise12;

public class DesktopPC extends Computer {
    private String PCcaseColor;
    public DesktopPC(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard, String computerCaseType) {
        super(processor, memory, storage, graphicsCard);
        this.PCcaseColor = computerCaseType;
    }

    public String getPCcaseColor() {
        return PCcaseColor;
    }

    public void setPCcaseColor(String PCcaseColor) {
        this.PCcaseColor = PCcaseColor;
    }
}
