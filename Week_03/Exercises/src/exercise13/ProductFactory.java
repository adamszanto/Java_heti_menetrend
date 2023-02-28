package exercise13;

public class ProductFactory extends Warehouse {

    public static Product productFactory(String barcode, PRODUCT_TYPE type, String manufacturer, int price, String specialType) {
        if(specialType.equals("Beauty")) {
            return new Beauty(type, barcode, 13000, 10, manufacturer);
        } else if(specialType.equals("Entertainment")) {
            return new Entertainment(type, barcode, 10000, manufacturer);
        } else if(specialType.equals("Kitchen")) {
            return new Kitchen(type, barcode, 14000, manufacturer);
        }
        return null;
    }
}
