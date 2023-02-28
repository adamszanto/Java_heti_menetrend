package exercise13;

import java.util.Date;

public class Beauty extends Product{
    private int weightKg;

    public Beauty(PRODUCT_TYPE productType, String barcode, int price, int weightKg, String manufacturer) {
        super(productType, barcode, price, manufacturer);
        this.weightKg = weightKg;
    }
}
