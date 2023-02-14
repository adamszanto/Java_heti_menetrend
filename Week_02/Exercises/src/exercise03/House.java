package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House {
    private String address;
    private int numberOfFloors;
    private List<Door> doors = new ArrayList<>();
    private List<Window> windows = new ArrayList<>();

    public House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        doors = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addWindow(Window window, int times) {
        for(int i = 0; i < times; i++) {
            windows.add(window);
        }
    }

    public void addDoor(Door door, int times) {
        for(int i = 0; i < times; i++) {
            doors.add(door);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }


    public void listDoorsAndWindows() {
        System.out.println(this.getAddress() + "'s list of windows & doors: ");
        System.out.println("Windows: ");
        for(Window window : windows) {
            System.out.println(window);
        }
        System.out.println("Doors: ");
        for(Door door : doors) {
            System.out.println(door);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (numberOfFloors != house.numberOfFloors) return false;
        if (!Objects.equals(address, house.address)) return false;
        if (!Objects.equals(doors, house.doors)) return false;
        return Objects.equals(windows, house.windows);
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + numberOfFloors;
        result = 31 * result + (doors != null ? doors.hashCode() : 0);
        result = 31 * result + (windows != null ? windows.hashCode() : 0);
        return result;
    }
}
