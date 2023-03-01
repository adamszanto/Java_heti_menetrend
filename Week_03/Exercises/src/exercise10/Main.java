package exercise10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //TODO: List.of() / Arrays.asList() és new Arraylist közötti különbség: Az előbbivel létrehozott lista IMMUTABLE. Hasonló történik, mintha egy Collections.unmodifiableList()-et hívnánk egy normális listára.

        List<Integer> numbers1 = List.of(1,2,3,4,5,6,7,8);
        List<Integer> numbers2 = List.of(1,2,3,4,5,6,7,8);

        Set<Integer> numberMix = new HashSet<>(numbers1);
        numberMix.addAll(numbers2);

    }
}
