package exercise09;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numSet = new HashSet<>();
        List<Integer> numList = new ArrayList<>(100);

        try(Scanner sc = new Scanner(System.in)) {
            int counter = 0;
            while(counter < 10) {
                System.out.println("Add numbers: ");
                if(sc.hasNextInt()) {
                    int num = sc.nextInt();
                    numSet.add(num);
                    numList.add(num);
                    counter++;
                } else {
                    sc.nextLine();
                }
            }
        }

        System.out.println("How many different numbers were: " + numSet.size() +" " + numSet);
        System.out.println("History of your num input: " +numList);

    }
}
