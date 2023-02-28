package exercise13;

import java.util.Date;

public class Kitchen extends Product{
    private boolean isPickedUp;
    private boolean isTurnedOn;

    public Kitchen(PRODUCT_TYPE productType, String barcode, int price, String manufacturer) {
        super(productType, barcode, price, manufacturer);
        this.isPickedUp = false;
        this.isTurnedOn = false;
    }

    public void pickUp() {
        isPickedUp = !isPickedUp;
    }

    public void turnOn() {
        isTurnedOn = !isTurnedOn;
    }

}
