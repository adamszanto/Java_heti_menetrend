package exercise12;

public class Computer {
        private Processor processor;
        private Memory memory;
        private Storage storage;
        private GraphicsCard graphicsCard;

    public Computer(Processor processor, Memory memory, Storage storage, GraphicsCard graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }
}
