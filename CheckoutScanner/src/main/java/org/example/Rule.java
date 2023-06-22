package org.example;

public class Rule {
    private String item;
    private int count;
    private int discountPrice;

    public Rule(String item, int count, int discountPrice) {
        this.item = item;
        this.count = count;
        this.discountPrice = discountPrice;
    }

    public String getItem() {
        return item;
    }

    public double getCount() {
        return count;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }
}
