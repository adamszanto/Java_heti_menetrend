package exercise04;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        System.out.println("Give me numbers! Write 0 to stop program");
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 1;
        try {
            while(scanner.nextInt() != 0) {
                int input = scanner.nextInt();
                if(input < min) {
                    min = input;
                }
                if(input > max){
                    max = input;
                }
            }

        } catch (NumberFormatException ex) {
            System.out.println("Number format is incorrect." + ex);
        } finally {
            System.out.println("Min: "+ min + "\nMax: " + max);
        }
    }

    // TODO: Exercise 05 kiegészítve. Read all values as text volt az eset:
    public int returnNumber(String line) {
        try {
            int x = Integer.parseInt(line);
            return x;
        } catch (NumberFormatException ex) {
            System.out.println("Error :" + ex);
            return -1;
        }
    }

}
