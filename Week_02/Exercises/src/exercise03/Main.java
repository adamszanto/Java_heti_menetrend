package exercise03;

public class Main {
    public static void main(String[] args) {
        Window smallWindow = new Window(635, 890);
        Window mediumWindow = new Window(736, 1194);
        Window largeWindow = new Window(736, 1498);

        Door frontDoor = new Door(1000, 2045);
        Door interiorDoor = new Door(800, 2045);

        House house1 = new House("Petofi 1", 2);
        house1.addWindow(smallWindow, 5);
        house1.addWindow(mediumWindow, 3);
        house1.addWindow(largeWindow, 2);

        house1.addDoor(frontDoor,1);
        house1.addDoor(interiorDoor, 4);

        house1.listDoorsAndWindows();
    }
}
