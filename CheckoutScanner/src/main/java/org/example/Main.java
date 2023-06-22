package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RuleEngine rules = new RuleEngine();

        String goods = "AAABB";

        CheckOut co = new CheckOut(rules);
        for(String item : Arrays.asList(goods.split(""))) {
            co.scan(item);
        }
        double total = co.getTotal();
        System.out.println("Total price: " + total);
    }
}