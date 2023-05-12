package org.example;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {
    private final RuleEngine rules;
    private final Map<String, Integer> items;

    public CheckOut(RuleEngine rules) {
        this.rules = rules;
        this.items = new HashMap<>();
    }

    public void scan(String item) {
        items.putIfAbsent(item, 0);
        items.put(item, items.get(item) + 1);
    }

    public int getTotal() {
//        int total = 0;
//        for (String item : items.keySet()) {
//            int count = items.get(item);
//            int price = rules.getPrice(item);
//            total += price;
//        }
//        return total;
        return rules.calculateTotal(items);
    }
}