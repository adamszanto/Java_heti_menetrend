package exercise13.engine;

import exercise13.product.Product;
import exercise13.report.ReportGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReader {


    public static void run(Warehouse warehouse1) {
        boolean flag = true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (flag) {
                System.out.println(Ikeaconstant.ADD + " " + Ikeaconstant.REMOVE + " " + Ikeaconstant.REPORT + " " + Ikeaconstant.EXIT);
                String[] command = br.readLine().split(" ");

                switch (command[0]) {
                    case Ikeaconstant.ADD:
                        CommandProcessor.addProduct(CommandProcessor.newProduct(command[1], command[2], command[3], command[4], command[5]), warehouse1);
                        break;

                    case Ikeaconstant.REMOVE:
                        CommandProcessor.removeProduct(command[1], warehouse1);
                        break;
                    case Ikeaconstant.REPORT:
                        ReportGenerator.reportGenerator(warehouse1);
                        break;
                    case Ikeaconstant.EXIT:
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
    }
}
