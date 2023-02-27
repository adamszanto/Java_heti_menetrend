package exercise00_IOStream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/exercise00_IOStream/input.txt");
            Scanner sc = new Scanner(inputStream);

            while(true) {
                if(sc.hasNextInt()) {
                    System.out.println(sc.nextInt());
                } else {
                    sc.next();
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found " + e);
        }
    }
}
