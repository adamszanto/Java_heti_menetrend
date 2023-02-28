package exercise13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                try {
                    while (flag) {
                        System.out.println("ADD, REMOVE, REPORT, EXIT");
                        String[] command = br.readLine().split(" ");

                        switch (command[0]) {
                            case "ADD":
                                System.out.println("This is an ADD command");
                                warehouse1.addProduct(command[1], (PRODUCT_TYPE.AVERAGE), command[3], Integer.parseInt(command[4]), command[5]);
                                break;

                            case "REMOVE":
                                System.out.println("This is a REMOVE command");
                                break;
                            case "REPORT":
                                System.out.println("This is a REPORT command");
                                break;
                            case "EXIT":
                                System.out.println("This is an EXIT commad");
                                flag = false;
                                break;
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    try {
                        br.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        System.out.println(warehouse1);



      //  Product product1 = ProductFactory.productFactory("1000324", PRODUCT_TYPE.AVERAGE, "Sony", 13000, "Entertainment");
      //  System.out.println(product1.toString());
    }

}
