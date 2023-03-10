package exercise12;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(countUniqueWords("toro toro toro bull red quack quack duck"));
    }

    public static int countUniqueWords(String text) {
        String[] words = text.split("\\s+");
        Set<String> visited = new HashSet<>();
        Set<String> uniqueWords = new HashSet<>();


        for(String word : words) {
            if (!visited.contains(word)) {
                uniqueWords.add(word);
                visited.add(word);
            } else {
                uniqueWords.remove(word);
            }
        }
        return uniqueWords.size();
    }
}
