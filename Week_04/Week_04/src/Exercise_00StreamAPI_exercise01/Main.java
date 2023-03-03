package Exercise_00StreamAPI_exercise01;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("bloodshed","joy","computing", "gossip", "learn", "global", "gossip",
                "learn", "global", "gossip", "learn", "global", "computing", "gossip", "learn",
                "global", "deer", "cut", "deer", "cut", "contempt", "throne" );

        words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum,
                        HashMap::new
                ))
                .forEach((key, value) -> System.out.println(key + ": " + value));

        words.stream()
                .collect(Collectors.toMap(
                        word -> word.length(),
                        word -> Set.of(word),
                        (set1, set2) -> {
                            Set<String> mergedSet = new HashSet<>(set1);
                            mergedSet.addAll(set2);
                            return mergedSet;
                        }
                ))
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
