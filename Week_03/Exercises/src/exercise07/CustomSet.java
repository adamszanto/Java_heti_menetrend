package exercise07;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    private Set<Integer> set;

    public CustomSet() {
        this.set = new HashSet<>();
    }

    public void addInteger(int num) {
        set.add(num);
    }

    public void removeInteger(int num) {
        set.remove(num);
    }

    public boolean containsInt(int num) {
        return set.contains(num);
    }

    public void printSet() {
        System.out.println(set);
    }
}
