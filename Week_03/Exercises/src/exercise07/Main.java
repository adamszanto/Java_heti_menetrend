package exercise07;

public class Main {
    public static void main(String[] args) {
        CustomSet set = new CustomSet();

        set.addInteger(32);
        set.addInteger(30);
        set.addInteger(25);
        set.addInteger(32);
        set.removeInteger(32);
        System.out.println(set.containsInt(25));
        System.out.println(set.containsInt(32));
        set.printSet();
    }
}
