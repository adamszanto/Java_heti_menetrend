package exercise13;

import java.util.Date;
import java.util.HashSet;

public class Entertainment extends Product{
    private final int numberOfTurnOns = 5;
    private boolean isTurnedOn;
    private int turnOnCounter;
    private boolean turnedOnTooManyTimes;

    public Entertainment(String barcode, PRODUCT_TYPE productType, String manufacturer, int price) {
        super(barcode, productType, manufacturer, price);
        this.turnOnCounter = 0;
        this.turnedOnTooManyTimes = false;
        this.isTurnedOn = false;
    }

    public int getTurnOnCounter() {
        return turnOnCounter;
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
