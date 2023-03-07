package exercise13.engine;

import exercise13.product.Product;
import exercise13.report.ReportGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReader {
    private final CommandProcessor processor;

    public CommandReader(CommandProcessor processor) {
        this.processor = processor;
    }

    public void run () {
        boolean flag = true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (flag) {
                System.out.println(Ikeaconstant.ADD + " " + Ikeaconstant.REMOVE + " " + Ikeaconstant.REPORT + " " + Ikeaconstant.EXIT);
                String[] command = br.readLine().split(" ");

                if (Ikeaconstant.EXIT.equals(command[0])) {
                    flag = false;
                } else {
                    processor.process(command);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
