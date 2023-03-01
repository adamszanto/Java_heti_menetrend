package exercise13.Engine;

import exercise13.Product.Product;
import exercise13.Product.ProductFactory;

public class CommandProcessor {

    public static Product newProduct(String barcode, String type, String manufacturer, String price, String category) {

        Product newProduct = ProductFactory.productFactory(barcode, type, manufacturer, Integer.parseInt(price), category);

        return newProduct;
    }

    public static void addProduct(Product product, Warehouse warehouse1) {
        warehouse1.addProduct(product);
    }

    public static void removeProduct(String barcode, Warehouse warehouse1) {
        warehouse1.removeProduct(barcode);
    }
}
