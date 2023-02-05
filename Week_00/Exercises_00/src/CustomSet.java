import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    private final Set<Integer> set = new HashSet<>();

    public void add(int element) {
        set.add(element);
    }

    public void remove(int element) {
        set.remove(element);
    }

    public boolean contains(int element) {
        return set.contains(element);
    }

    public void print() {
        System.out.println(set);
    }

    // TODO Print Újraírni: ahol egyesével kiiratni az elemeket, forEach/Iterator/for-each + metódus amivel egyesével visszaadni
}
