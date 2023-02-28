package exercise13;

import java.lang.reflect.InvocationHandler;
import java.util.*;

public class Warehouse implements Iterable<Product>{
    private Set<Product> productList;

    public Warehouse() {
        this.productList = new HashSet<>();
    }

    public void addProduct(String barcode, PRODUCT_TYPE type, String manufacturer, String price, String category) {
        Product newProduct = ProductFactory.productFactory(barcode, PRODUCT_TYPE.AVERAGE, manufacturer, Integer.parseInt(price), category);
        productList.add(newProduct);
    }

    public void removeProduct(String barcode) {
        for(Product product : productList) {
            if(product.getBarcode().equals(barcode)) {
                productList.remove(product);
                break;
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
