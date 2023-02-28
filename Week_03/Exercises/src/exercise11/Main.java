package exercise11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        wordFilter("toro toro bull red quack quack duck");
    }

    public static void wordFilter(String sentence) {
        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();

        for(String word : words) {
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);
    }
}
