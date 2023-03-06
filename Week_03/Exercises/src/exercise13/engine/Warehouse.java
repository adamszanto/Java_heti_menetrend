package exercise13.engine;

import exercise13.product.Entertainment;
import exercise13.product.Product;

import java.util.*;

public class Warehouse implements Iterable<Product>{
    private final Set<Product> products;

    public Warehouse() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String barcode) {
        Iterator<Product> iterator = products.iterator();

        while(iterator().hasNext()) {
            Product p = iterator().next();

            if(p.getBarcode().equals(barcode)){
                iterator.remove();
            }
        }
    }

    public void reportProducts() {
        System.out.println("Product list: " + products.size());
        System.out.println("Entertainment products with more than 2 turn on capacities: ");
    }

    public void printUsableEntertainmentProducts() {
        for(Product product : products) {
            if(product instanceof Entertainment && ((Entertainment) product).getTurnOnCounter() < 4) {
                System.out.println(product);
            }
        }
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
