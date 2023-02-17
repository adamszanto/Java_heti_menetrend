package exercise12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DesktopPC desktopPC = (DesktopPC) o;

        return Objects.equals(PCcaseColor, desktopPC.PCcaseColor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (PCcaseColor != null ? PCcaseColor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DesktopPC{" +
                "PCcaseColor='" + PCcaseColor + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop PC has turned on.");
    }
}
