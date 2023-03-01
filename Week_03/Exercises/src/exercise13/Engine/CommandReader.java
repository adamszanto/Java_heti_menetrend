package exercise13.Engine;

import exercise13.Product.Product;
import exercise13.Report.ReportGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReader {


    public static void run(Warehouse warehouse1) {
        boolean flag = true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (flag) {
                System.out.println(IKEACONSTANT.ADD + " " + IKEACONSTANT.REMOVE + " " + IKEACONSTANT.REPORT + " " + IKEACONSTANT.EXIT);
                String[] command = br.readLine().split(" ");

                switch (command[0]) {
                    case IKEACONSTANT.ADD:
                        CommandProcessor.addProduct(CommandProcessor.newProduct(command[1], command[2], command[3], command[4], command[5]), warehouse1);
                        break;

                    case IKEACONSTANT.REMOVE:
                        CommandProcessor.removeProduct(command[1], warehouse1);
                        break;
                    case IKEACONSTANT.REPORT:
                        ReportGenerator.reportGenerator(warehouse1);
                        break;
                    case IKEACONSTANT.EXIT:
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
