package exercise13;

public class ProductFactory extends Warehouse {

    public static Product productFactory(String barcode, PRODUCT_TYPE type, String manufacturer, int price, String specialType) {
        if(specialType.equals("Beauty")) {
            return new Beauty(barcode, type, manufacturer, price, 10);
        } else if(specialType.equals("Entertainment")) {
            return new Entertainment(barcode, type, manufacturer, price);
        } else if(specialType.equals("Kitchen")) {
            return new Kitchen(barcode, type, manufacturer, price);
        }
        return null;
    }
}
