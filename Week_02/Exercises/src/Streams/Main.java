package Streams;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 1. példa: A BufferedReadert hogyan tudjuk használni az InputStreamReaderrel
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String line = null;
//            int count = 0;
//
//            while(!"EXIT".equals(line = br.readLine())) {
//                count++;
//            }
//            System.out.println("Rows: " + count);
//
//        } catch (IOException ex) {
//            System.out.println("Something wrong happened: " + ex);
//        }

        // Olvasni ugyanígy: BufferedReader, amibe belecsomagolunk egy FileReadert,konstruktor paraméterként pedig megadjuk a fájl elérési útvonalát
        // 2. példa: Hogyan tudunk fájlba írni:

        try (PrintWriter pw = new PrintWriter(new FileWriter("out.txt"))) {
            int count = 10;
            String where = "table";
            pw.printf("There are %d apples on the %s", count, where);

        } catch (IOException ex) {
            System.out.println("Error: "+ ex);
        }
    }
}
