package exercise06;

public class Main {
    public static void main(String[] args) {
        CustomList list = new CustomList();

        list.addString("Hello");
        list.addString("Bello");
        list.addString("Cello");
        list.addString("Dello");

        list.removeString(0);
        list.removeString("Dello");
        System.out.println(list.searchString("Cello"));
        System.out.println(list.searchString("Dello"));
        list.printList();
    }
}
