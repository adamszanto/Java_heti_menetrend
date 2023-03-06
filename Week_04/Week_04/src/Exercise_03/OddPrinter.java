package Exercise_03;

import java.util.Random;

public class OddPrinter implements Runnable {
    private Random random = new Random();
    @Override
    public void run() {
        while(true) {
            int number = random.nextInt(100);
            if(number % 2 == 1) {
                System.out.println(number);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted " + ex);
            }
        }
    }
}
