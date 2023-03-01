package exercise13.Product;

public class Kitchen extends Product {

    private boolean isPickedUp;
    private boolean isTurnedOn;

    public Kitchen(String barcode, ProductType productType, String manufacturer, int price) {
        super(barcode, productType, manufacturer, price);
        this.isPickedUp = false;
        this.isTurnedOn = false;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "isPickedUp=" + isPickedUp +
                ", isTurnedOn=" + isTurnedOn +
                '}' + super.toString();
    }

    public void pickUp() {
        isPickedUp = !isPickedUp;
    }

    public void turnOn() {
        isTurnedOn = !isTurnedOn;
    }

}
