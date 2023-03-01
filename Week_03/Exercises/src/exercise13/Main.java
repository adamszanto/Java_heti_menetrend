package exercise13;

import exercise13.Engine.Warehouse;
import exercise13.Product.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO: ConsoleReader, InputReader, stb. kiszervezni ezt a kódot:
        // TODO: Try-with-resources legyen a br is...
        // TODO: ADD, REMOVE, REPORT, EXIT = Static final típusú változók legyenek
        // TODO: IKEACONSTANT nevű osztály, ami final osztály privát konstruktorral és konstansokat tartalmaz.
        // TODO: Ökölszabály: Csak konstansok tárolására használt osztály legyen final, és privát konstruktorral ellátott.
        // TODO: Nem kell a beolvasás helyén feldolgozni a parancsot. Kiszervezni külön metódusba/osztályba? Váljon el ez a kettő. A CommandReader átad > a CommandProcessor classnak stb...
        // TODO: ProductStore / Warehouse osztály is legyen, ami tárol. A CommandProcessor tud adni neki Productot.
        // TODO: Reportgenerálás megint csak 1 új osztály legyen...ReportGenerator pl.

                try {
                    while (flag) {
                        System.out.println("ADD, REMOVE, REPORT, EXIT");
                        String[] command = br.readLine().split(" ");

                        switch (command[0]) {
                            case "ADD":
                                warehouse1.addProduct(command[1], command[2], command[3], command[4], command[5]);
                                break;

                            case "REMOVE":
                                warehouse1.removeProduct(command[1]);
                                break;
                            case "REPORT":
                                warehouse1.printUsableEntertainmentProducts();
                                break;
                            case "EXIT":
                                flag = false;
                                break;
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                for(Product prod : warehouse1) {
                    System.out.println(prod);
                }

/*
        ADD 1001 AVERAGE Sony 850 Entertainment
        ADD 1002 POPULAR Sony 849 Entertainment
        ADD 1005 AVERAGE Samsung 1100 Beauty
        ADD 1006 AVERAGE Samsung 1125 Beauty
        ADD 1010 LUXURY_ITEM Sencor 1900 Kitchen
        ADD 1011 AVERAGE Panasonic 1131 Kitchen
        ADD 1003 AVERAGE Sony 750 Entertainment
        REPORT
        REMOVE 1001
*/
    }

}
