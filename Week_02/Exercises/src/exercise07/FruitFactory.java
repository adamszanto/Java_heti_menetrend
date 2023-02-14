package exercise07;

// TODO ujrairni Fruit ősosztály > 3 féle fruit, Factory kap egy Fruitot,
//  és a paraméter alapján a helyes Fruit megkapjuk.
//

import java.util.Optional;

public class FruitFactory {
    public static Fruit createFruit(String input) {
        for(FruitType type : FruitType.values()) {
            if(type.getInput().equals(input)) {
                return new Fruit(input);
            }
        }
        return null;
    }

    public Optional<Fruit> create(String input) {
        for(FruitType type : FruitType.values()) {
            if(type.getInput().equals(input)) {
                return Optional.of(new Fruit(input));
            }
        }
        return Optional.empty();
    }
}



