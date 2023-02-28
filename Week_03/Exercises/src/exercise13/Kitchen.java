package exercise13;

import java.util.Date;

public class Kitchen extends Product{
    private boolean isPickedUp;
    private boolean isTurnedOn;

    public Kitchen(String barcode, PRODUCT_TYPE productType, String manufacturer, int price) {
        super(barcode, productType, manufacturer, price);
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
