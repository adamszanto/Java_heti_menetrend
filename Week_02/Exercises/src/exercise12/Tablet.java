package exercise12;

import java.util.Objects;

public class Tablet extends Computer{
    private String touchScreentype;

    public Tablet(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard, String touchScreentype) {
        super(processor, memory, storage, graphicsCard);
        this.touchScreentype = touchScreentype;
    }

    public String getTouchScreentype() {
        return touchScreentype;
    }

    public void setTouchScreentype(String touchScreentype) {
        this.touchScreentype = touchScreentype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tablet tablet = (Tablet) o;

        return Objects.equals(touchScreentype, tablet.touchScreentype);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (touchScreentype != null ? touchScreentype.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "touchScreentype='" + touchScreentype + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet has turned on.");
    }
}
