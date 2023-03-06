package exercise13.product;

public class ProductFactory {

    public Product create(String barcode, String type, String manufacturer, int price, String specialType) {

        if ("Beauty".equals(specialType)) {
            return new Beauty(barcode, ProductType.valueOf(type), manufacturer, price, 10);
        } else if ("Entertainment".equals(specialType)) {
            return new Entertainment(barcode, ProductType.valueOf(type), manufacturer, price);
        } else if ("Kitchen".equals(specialType)) {
            return new Kitchen(barcode, ProductType.valueOf(type), manufacturer, price);
        }
        return null;
    }
}
