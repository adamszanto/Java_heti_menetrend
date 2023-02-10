package exercise04;

import java.util.List;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void buyInStore(Store store, Product product, int quantity) {

        double transactionValue = product.getPrice() * quantity;

        if(this.budget > transactionValue) {
            this.budget -= transactionValue;
            store.addRevenue(transactionValue);
            System.out.println("Succesful purchase.");
        } else {
            System.out.println("Insufficient funds.");
        }


    }
}
