package Exercise_03;

public class Main {
    public static void main(String[] args) {
        Thread oddPrinter1 = new Thread(new OddPrinter());
        Thread oddPrinter2 = new Thread(new OddPrinter());
        Thread oddPrinter3 = new Thread(new OddPrinter());
        Thread evenPrinter1 = new Thread(new EvenPrinter());
        Thread evenPrinter2 = new Thread(new EvenPrinter());
        Thread evenPrinter3 = new Thread(new EvenPrinter());

        oddPrinter1.start();
        oddPrinter2.start();
        oddPrinter3.start();
        evenPrinter1.start();
        evenPrinter2.start();
        evenPrinter3.start();
    }
}
