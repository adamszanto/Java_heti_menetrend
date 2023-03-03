package Exercise_00StreamAPI_exercise;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Stream<Integer> numbers1 = Stream.of(52, 89, 16, 755, 3, 1, 0, -87, -526, -4, 9, 236);
//
//        List<Integer> positiveNumbers = numbers1
//                .filter(number -> number > 0)
//                .collect(Collectors.toList());
//
//        System.out.println(positiveNumbers);
//
//        Stream<Integer> numbers2 = Stream.of(52, 89, 16, 755, 3, 1, 0, -87, -526, -4, 9, 236);
//        List<Integer> negNumbers = numbers2
//                .filter(number -> number < 0)
//                .collect(Collectors.toList());
//        System.out.println(negNumbers);
//
//        Stream<Integer> numbers3 = Stream.of(52, 89, 16, 755, 3, 1, 0, -87, -526, -4, 9, 236);
//        numbers3
//                .map(number -> String.valueOf(number).length())
//                .collect(Collectors.toSet())
//                .forEach(number -> System.out.println(number));
//
//        Stream<Integer> numbers4 = Stream.of(52, 89, 16, 755, 3, 1, 0, -87, -526, -4, 9, 236);
//        OptionalInt optionalInt = numbers4
//                .mapToInt(number -> number)
//                .max();
//
//        if(optionalInt.isPresent()) {
//            System.out.println(optionalInt.getAsInt());
//        }

        List<Shop> shops = new LinkedList<>();

        shops.add(new Shop("IKEA", 50));
        shops.add(new Shop("Beer & Beer", 112));
        shops.add(new Shop("Rio Piel", 160));
        shops.add(new Shop("Souvenir City", 20));
        shops.add(new Shop("The Lucky Shop", 10));

        System.out.println("List the name of the shops: ");
        shops.stream()
                .map(name -> name.getName())
                .forEach(name -> System.out.println(name));

        System.out.println("The name of the largest store: ");
        Optional<Shop> shOptional = shops.stream()
                .sorted((s1, s2) -> s2.getArea() - s1.getArea())
                .findFirst();

        if(shOptional.isPresent()) {
            System.out.println(shOptional.get().getName() + " " + shOptional.get().getArea());
        }

        // List the name of the shops in order:
        System.out.println("The name of the shops in order: ");
        shops.stream()
                .map(name -> name.getName())
                .sorted()
                .forEach(name -> System.out.println(name));

        // List the name of the smallest shop from shops having t or T in their names:
        System.out.println("Smallest shop from shops having t or T in their names: ");
        Optional<Shop> smallestShopOptional =
                shops.stream()
                        .filter(shop -> shop.getName().toLowerCase().contains("t"))
                        .min((s1, s2) -> s1.getArea() - s2.getArea());

        if(smallestShopOptional.isPresent()) {
            System.out.println(smallestShopOptional.get().getName());
        }
    }
}
