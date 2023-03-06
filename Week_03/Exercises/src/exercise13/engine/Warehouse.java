package exercise13.engine;

import exercise13.product.Entertainment;
import exercise13.product.Product;

import java.util.*;

public class Warehouse implements Iterable<Product>{
    private final Set<Product> productList;

    public Warehouse() {
        this.productList = new HashSet<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(String barcode) {
        Iterator<Product> iterator = productList.iterator();

        while(iterator().hasNext()) {
            Product p = iterator().next();

            if(p.getBarcode().equals(barcode)){
                iterator.remove();
            }
        }
    }

    public void reportProducts() {
        System.out.println("Product list: " + productList.size());
        System.out.println("Entertainment products with more than 2 turn on capacities: ");
    }

    public void printUsableEntertainmentProducts() {
        for(Product product : productList) {
            if(product instanceof Entertainment && ((Entertainment) product).getTurnOnCounter() < 4) {
                System.out.println(product);
            }
        }
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }
}
