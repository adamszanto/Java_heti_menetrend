package exercise11;

public class Television {
    private static final int MAX_TURN_ONS = 10;
    private final String manufacturer;
    private final String type;
    private final TelevisionCounter counter;

    public Television(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
        counter = new TelevisionCounter();
    }

    public void pushButton() {
        if(counter.getCounter() < MAX_TURN_ONS && !counter.isTurnedOn()) {
            counter.addToCounter();
            System.out.println("Television is turned on. Turn ons left: " + (MAX_TURN_ONS - counter.getCounter()));
            counter.toggleTurnedOn();

        } else if (counter.getCounter() < MAX_TURN_ONS && counter.isTurnedOn()) {
            System.out.println("Television is turned off.");
            counter.toggleTurnedOn();
        } else {
            System.out.println("Television exceeded its limit of 10 turn ons.");
        }
    }
}
