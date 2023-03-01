package exercise07;

public class Main {
    public static void main(String[] args) {
        CustomSet string = new CustomSet();

        string.addInteger(32);
        string.addInteger(30);
        string.addInteger(25);
        string.addInteger(32);
        string.removeInteger(32);
        System.out.println(string.containsInt(25));
        System.out.println(string.containsInt(32));
        string.printSet();
    }
}
