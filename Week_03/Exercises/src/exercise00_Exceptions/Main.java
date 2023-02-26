package exercise00_Exceptions;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pr = new PrintWriter(new FileWriter("out.txt"))) {
            String line = null;
        } catch (IOException e) {
            System.out.println("Something went wrong " + e);

        }
    }
}

