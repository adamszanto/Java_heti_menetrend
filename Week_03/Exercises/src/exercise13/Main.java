package exercise13;

import exercise13.Engine.CommandReader;
import exercise13.Engine.Warehouse;
import exercise13.Product.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        CommandReader.run(warehouse1);

        // TODO: PIPA ConsoleReader, InputReader, stb. kiszervezni ezt a kódot:
        // TODO: PIPA Try-with-resources legyen a br is...
        // TODO: ADD, REMOVE, REPORT, EXIT = Static final típusú változók legyenek
        // TODO: IKEACONSTANT nevű osztály, ami final osztály privát konstruktorral és konstansokat tartalmaz.
        // TODO: Ökölszabály: Csak konstansok tárolására használt osztály legyen final, és privát konstruktorral ellátott.
        // TODO: PIPA Nem kell a beolvasás helyén feldolgozni a parancsot. Kiszervezni külön metódusba/osztályba? Váljon el ez a kettő. A CommandReader átad > a CommandProcessor classnak stb...
        // TODO: PIPA ProductStore / Warehouse osztály is legyen, ami tárol. A CommandProcessor tud adni neki Productot.
        // TODO: PIPA Reportgenerálás megint csak 1 új osztály legyen...ReportGenerator pl.


    }
}
