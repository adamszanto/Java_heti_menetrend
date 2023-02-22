package exercise02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        countLines();
    }

    public static void countLines() {
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/exercise02/input.txt"))) {

            while(br.readLine() != null) {
                counter++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error! File not found.");
        } catch (IOException ex) {
            System.out.println("Error, File not readable.");
        }

        System.out.println(counter);
    }
}

