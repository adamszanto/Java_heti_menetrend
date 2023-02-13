package exercise07;

public class FruitFactory {
    public static Fruit createFruit(String input) {
        for(FruitType type : FruitType.values()) {
            if(type.getInput().equals(input)) {
                return new Fruit(input);
            }
        }
        return null;
    }
}
