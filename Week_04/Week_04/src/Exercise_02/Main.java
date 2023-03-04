package Exercise_02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream()
                .sorted()
                .forEach(name -> System.out.println(name));

        long countNames = memberNames.stream()
                .filter(name -> name.toLowerCase().startsWith("a")).count();
        System.out.println("There are " + countNames + " names starting with \"S\".");

        List<String> sixCharNames = memberNames.stream()
                .filter(name -> name.length() >=6 )
                .collect(Collectors.toList());
        System.out.println("Longer names than 6 characters: " + sixCharNames);

        boolean isthereNameWithA = memberNames.stream()
                .anyMatch(name -> name.toLowerCase().startsWith("a"));

        if(isthereNameWithA) {
            System.out.println("There is at lest one name that starts with \"A\".");
        } else {
            System.out.println("There is no name that starts with \"A\".");
        }

//        String randomNameWithA = memberNames.stream()
//                .filter(name -> name.toLowerCase().startsWith("A"))
//                .findFirst()
//                .get();

        System.out.print("Random name with \"A\": ");
        memberNames.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .findFirst()
                .ifPresent(System.out::println);

        boolean namesHaveNoSpace = memberNames.stream()
                .allMatch(name -> !name.contains(" "));
        System.out.println("Names have no space in them at all: " + namesHaveNoSpace);

        boolean namesHaveAchar = memberNames.stream()
                .allMatch(name -> name.toLowerCase().contains("a"));

        System.out.println("Every name has the character \"a\": " + namesHaveAchar);
    }
}
