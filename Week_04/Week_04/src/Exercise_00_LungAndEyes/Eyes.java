package Exercise_00_LungAndEyes;

public class Eyes extends Thread {
    public void blink() {
        System.out.println("Eye blinks");
        Main.calories -= 5;
    }

    public void run() {
        while(Main.calories > 0){
            try {
                blink();
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                System.out.println("Eye interrupted " + ex);
            }
        }
    }
}
