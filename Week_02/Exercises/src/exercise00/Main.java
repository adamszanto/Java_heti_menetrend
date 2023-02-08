package exercise00;

// Generate
public class Main {
    public static void main(String[] args) {
        System.out.println(getRandom(55,1920));
        System.out.println(getRandom(55,1920));
        System.out.println(getRandom(55,1920));
        System.out.println(getRandom(55,1920));
    }

    public static long getRandom(int min, int max) {
        return Math.round(Math.random() * (1920 - 55) + 55);
    }
}
