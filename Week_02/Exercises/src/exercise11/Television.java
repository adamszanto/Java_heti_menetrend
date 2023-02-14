package exercise11;

public class Television {
    private String manufacturer;
    private String type;
    private TelevisionCounter counter;

    public Television(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
        counter = new TelevisionCounter();
    }

    public void pushButton() {
        if(counter.getCounter() < 10 && !counter.isTurnedOn()) {
            counter.addToCounter();
            System.out.println("Television is turned on. Turn ons left: " + (10 - counter.getCounter()));
            counter.toggleTurnedOn();

        } else if (counter.getCounter() < 10 && counter.isTurnedOn()) {
            System.out.println("Television is turned off.");
            counter.toggleTurnedOn();
        } else {
            System.out.println("Television exceeded its limit of 10 turn ons.");
        }
    }
}
