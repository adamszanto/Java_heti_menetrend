package exercise13.Product;

public class Entertainment extends Product {
    private final int numberOfTurnOns = 5;
    private boolean isTurnedOn;
    private int turnOnCounter;
    private boolean turnedOnTooManyTimes;

    public Entertainment(String barcode, ProductType productType, String manufacturer, int price) {
        super(barcode, productType, manufacturer, price);
        this.turnOnCounter = 0;
        this.turnedOnTooManyTimes = false;
        this.isTurnedOn = false;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "numberOfTurnOns=" + numberOfTurnOns +
                ", isTurnedOn=" + isTurnedOn +
                ", turnOnCounter=" + turnOnCounter +
                ", turnedOnTooManyTimes=" + turnedOnTooManyTimes +
                '}' + super.toString();
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
