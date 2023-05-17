package org.example;

import java.util.HashMap;
import java.util.Map;

public class RuleEngine {
    // Meghívja az A,B,C,D rulet és összeadja a totalt.
    private final Map<String, Integer> basePriceByItems = Map.of(
            "A",50,
            "B", 30,
            "C", 20,
            "D", 15
    );
    private final Map<String, Rule> ruleByItems;
    private boolean doubleBRule;
    private double priceConstant = 1.0;

    public RuleEngine() {
        this.ruleByItems = new HashMap<>();
        initRules();
    }

    public void initRules() {
        Rule ruleA = new Rule("A", 3, 130);
        Rule ruleB = new Rule("B", 2, 45);
        ruleByItems.put("A", ruleA);
        ruleByItems.put("B", ruleB);
        doubleBRule = true;
    }

    public double getPrice(String item, int numberOfItem) {
        Integer price = basePriceByItems.get(item);

        if(doubleBRule && basePriceByItems.containsKey("B")) {
            fetchIfRequirementMeets(item);
        }

        if(price == null) {
            return 0;
        }

        if(ruleByItems.containsKey(item)) {
            Rule rule = ruleByItems.get(item);
            int ruleCount = rule.getCount();
            if(numberOfItem >= ruleCount) {
                int discountPrice = rule.getDiscountPrice();
                int numDiscounts = numberOfItem / ruleCount;
                int remainder = numberOfItem % ruleCount;

                return (numDiscounts * discountPrice + remainder * price) * priceConstant;
            }
        }
        return price * numberOfItem;
    }

    public double calculateTotal(Map<String, Integer> items) {
        int total = 0;
        for (String item : items.keySet()) {
            int count = items.get(item);
            double price = getPrice(item, count);
            total += price;
        }
        return total;
    }

    public void fetchIfRequirementMeets(String item) {
        if(ruleByItems.get(item).getCount() >= 2) {
            priceConstant = 0.8;
        }
    }
}
