package exercise11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        wordFilter("toro toro bull red quack quack duck");
    }

    public static void wordFilter(String sentence) {
        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();

        uniqueWords.addAll(Arrays.asList(words));

        System.out.println(uniqueWords);
    }
}
