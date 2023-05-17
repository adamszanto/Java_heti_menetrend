package org.example;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {
    private final RuleEngine rules;
    private final Map<String, Integer> items;
    private boolean tripleARuleFetch;

    public CheckOut(RuleEngine rules) {
        this.rules = rules;
        this.items = new HashMap<>();
        tripleARuleFetch = false;
    }

    public void scan(String item) {
        items.putIfAbsent(item, 0);
        items.put(item, items.get(item) + 1);

        if(item.equals("A")) {
            tripleARuleFetch = true;
        }
    }

    public double getTotal() {
        return rules.calculateTotal(items);
    }
}