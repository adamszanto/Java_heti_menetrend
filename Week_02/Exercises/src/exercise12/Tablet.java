package exercise12;

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
}
