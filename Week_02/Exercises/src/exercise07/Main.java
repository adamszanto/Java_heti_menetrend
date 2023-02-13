package exercise07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Fruit> fruitStore = new HashSet<>();

        try {
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < 15; i++) {
                System.out.println("Fruit input " + (i+1) + "/15. Enter a fruit code A, K or S: ");
                String input = scanner.nextLine();
                Fruit fruit = FruitFactory.createFruit(input);
                if(fruit !=null) {
                    fruitStore.add(fruit);
                } else {
                    System.out.println("Enter input again.");
                    i--;
                }

            }
        } catch (Exception e) {
            System.out.println("Something is wrong. Try it again. " + e.getMessage());
        }

        System.out.println("The fruit store has: ");
        for(Fruit fruit : fruitStore) {
            System.out.print(fruit.getType() + " ");
        }
    }
}
