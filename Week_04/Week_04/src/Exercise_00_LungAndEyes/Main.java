package Exercise_00_LungAndEyes;

public class Main {
    public static int calories = 50;
    public static void main(String[] args) {

        Lungs lungs = new Lungs();
        Eyes eyes = new Eyes();

        lungs.start();
        eyes.start();
    }
}
