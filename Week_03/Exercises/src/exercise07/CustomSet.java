package exercise07;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    private final Set<Integer> numbers;

    public CustomSet() {
        this.numbers = new HashSet<>();
    }

    public void addInteger(int num) {
        numbers.add(num);
    }

    public void removeInteger(int num) {
        numbers.remove(num);
    }

    public boolean containsInt(int num) {
        return numbers.contains(num);
    }

    public void printSet() {
        System.out.println(numbers);
    }
}
