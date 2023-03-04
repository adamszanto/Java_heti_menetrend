package Exercise_03;

import java.util.Random;

public class EvenPrinter implements Runnable {
    private Random random = new Random();

    @Override
    public void run() {
        while(true) {
            int number = random.nextInt(100);
            if (number % 2 == 0) {
                System.out.println(number);
            }
            try {
                Thread.sleep(8000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted " + ex);
            }
        }
    }
}
