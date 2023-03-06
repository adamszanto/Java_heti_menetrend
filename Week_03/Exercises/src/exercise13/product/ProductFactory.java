package exercise13.product;

import exercise13.engine.Warehouse;

public class ProductFactory extends Warehouse {

    public static Product productFactory(String barcode, String type, String manufacturer, int price, String specialType) {
        if(specialType.equals("Beauty")) {
            return new Beauty(barcode, ProductType.valueOf(type), manufacturer, price, 10);
        } else if(specialType.equals("Entertainment")) {
            return new Entertainment(barcode, ProductType.valueOf(type), manufacturer, price);
        } else if(specialType.equals("Kitchen")) {
            return new Kitchen(barcode, ProductType.valueOf(type), manufacturer, price);
        }
        return null;
    }
}
