package Exercise_01;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-12,2,6,78,41,25,-126,-8,-7,-52,458,5);

        //a. elemek összege
        int numbersSum = numbers.stream()
                .reduce(0, (a,b) -> (a+b));

        System.out.println("Sum :" + numbersSum);

        //b. az elemek száma

        long numOfElements = numbers.stream()
                .count();
        System.out.println("Number of elements: " + numOfElements);

        // c. legkisebb elem

        Optional<Integer> minimumElement = numbers.stream()
                .min(Comparator.naturalOrder());

        if(minimumElement.isPresent()) {
            System.out.println("Minimum elements: " + minimumElement);
        }

        // d. legnagyobb elem

        Optional<Integer> maximumElement = numbers.stream()
                .max(Comparator.naturalOrder());

        if(maximumElement.isPresent()) {
            System.out.println("Maximum element: " + maximumElement);
        }

        // e. növekvő sorrendben

        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted list: " + sortedList);

        // f. páros elemek számát

        List<Integer> evenElements = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even elements: " + evenElements);

        // g.

        List<Integer> oddElements = numbers.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());

        System.out.println("Odd elements: " + oddElements);

        // h.
        List<Integer> negativeElements = numbers.stream()
                .filter(num -> num < 0)
                .collect(Collectors.toList());

        System.out.println("Negative elements: " + negativeElements);

        // i.
        List<Integer> positiveElements = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
        System.out.println("Positive elements: " + positiveElements);

        //j.
        Set<Integer> evenElementsSet = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println("Even elements collected in a Set: " + evenElementsSet);
    }
}
