package exercise12;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor("Ryzen", "1000X", 7, 7.2);
        Memory memory = new Memory("Kingston", "1000X", 16);
        Storage storage = new Storage("Samsung", "1001X", 320);
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", "GTX400", 16);

        Computer laptop = new Laptop(processor, memory, storage, graphicsCard, 8200);
        User user1 = new User("Peter", laptop);


    }
}
