package exercise13;

import java.util.Date;

public class Beauty extends Product{
    private int weightKg;

    public Beauty(String barcode, PRODUCT_TYPE productType, String manufacturer, int price, int weightKg) {
        super(barcode,productType, manufacturer, price);
        this.weightKg = weightKg;
    }
}
