package exercise02;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(83);
        list.add(65);
        list.add(43);
        list.add(7);
        list.add(13);
        list.remote(13);
        list.print();
        System.out.println("Index of 43 is: " + list.indexOf(43));
    }
}
