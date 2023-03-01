package exercise02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        countLines();
    }

    public static void countLines() {
        // TODO: File.separator, windows / linux \ a file elerest meg lehet oldani elegansabban is...
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "exercise02" + File.separator + "input.txt"))) {

            while(br.readLine() != null) {
                counter++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error! File not found: " + ex);
        } catch (IOException ex) {
            System.out.println("Error, File not readable " + ex);
        }

        System.out.println(counter);
    }
}

