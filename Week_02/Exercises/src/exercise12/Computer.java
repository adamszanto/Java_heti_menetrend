package exercise12;

public abstract class Computer {
        private final Processor processor;
        private final Memory memory;
        private final Storage storage;
        private final GraphicsCard graphicsCard;

    public Computer(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // TODO: absztrakt metodus bekapcsolni() minden osztalyhoz egyedileg megoldani kulon-kulon
}
