package exercise08;

import exercise07.CustomSet;

public class Main {
    public static void main(String[] args) {
        CustomMap map = new CustomMap();

        map.addMap(10, "Hello ");
        map.addMap(11, "Bello ");
        map.addMap(12, "Cello ");
        map.removeMap(12);
        System.out.println(map.getValueForKey(11));
        System.out.println(map.getValueForKey(12));
        map.printMap();
    }
}
