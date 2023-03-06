package exercise13;

import exercise13.engine.CommandProcessor;
import exercise13.engine.CommandReader;
import exercise13.engine.Warehouse;
import exercise13.product.ProductFactory;
import exercise13.report.ReportGenerator;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        ProductFactory factory = new ProductFactory();
        ReportGenerator reportGenerator = new ReportGenerator(warehouse);
        CommandProcessor processor = new CommandProcessor(warehouse, factory, reportGenerator);
        CommandReader reader = new CommandReader(processor);
        reader.run();

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
