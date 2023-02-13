package exercise11;

public class Television {
    private String manufacturer;
    private String type;
    private int counter;
    private boolean isWorking;
    private boolean isTurnedOn;

    public Television(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.counter = 0;
        this.isWorking = true;
        this.isTurnedOn = false;
    }

    public void pushButton() {
        if(counter < 10 && !isTurnedOn) {
            counter++;
            System.out.println("Television is turned on. Turn ons left: " + (10 -counter));
            isTurnedOn = true;

        } else if (counter < 10 && isTurnedOn) {
            System.out.println("Television is turned off.");
            isTurnedOn = false;
        } else {
            System.out.println("Television exceeded its limit of 10 turn ons.");
        }
    }
}
