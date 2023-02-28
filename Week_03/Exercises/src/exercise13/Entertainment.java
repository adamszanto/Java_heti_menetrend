package exercise13;

import java.util.Date;

public class Entertainment extends Product{
    private final int numberOfTurnOns = 5;
    private boolean isTurnedOn;
    private int turnOnCounter;
    private boolean turnedOnTooManyTimes;

    public Entertainment(PRODUCT_TYPE productType, String barcode, int price, String manufacturer) {
        super(productType, barcode, price, manufacturer);
        this.turnOnCounter = 0;
        this.turnedOnTooManyTimes = false;
        this.isTurnedOn = false;
    }

    public void isTurnedOn() throws EntertainmentException {
            if(turnOnCounter < numberOfTurnOns) {
                isTurnedOn = !isTurnedOn;
                turnOnCounter++;
            } else {
                throw new EntertainmentException("Too many turn ons.");
            }
    }
}
