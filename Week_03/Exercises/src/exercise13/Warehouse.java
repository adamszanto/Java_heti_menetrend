package exercise13;

import java.lang.reflect.InvocationHandler;
import java.util.*;

public class Warehouse {
    private Set<Product> productList;

    public Warehouse() {
        this.productList = new HashSet<>();
    }

    public void addProduct(String barcode, PRODUCT_TYPE type, String manufacturer, int price, String category) {
        Product newProduct = ProductFactory.productFactory(barcode, PRODUCT_TYPE.AVERAGE, manufacturer, price, category);
        productList.add(newProduct);
    }

}
