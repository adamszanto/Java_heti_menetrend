package AbstractClassVSInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        words.put(0, "A");
        words.put(1, "B");
        words.put(2, "C");
        // előbb a kulcsot adjuk meg, utána pedig az értéket. kulcs-érték pár.

        for(Integer i : words.keySet()) {
            System.out.println(i);
        }

        for(String s : words.values()) {
            System.out.println(s);
        }
    }
}
