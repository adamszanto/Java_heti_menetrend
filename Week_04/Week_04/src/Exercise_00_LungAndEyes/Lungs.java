package Exercise_00_LungAndEyes;

public class Lungs extends Thread{
    public void inhale() {
        System.out.println("Lung inhaling");
        Main.calories -= 5;
    }

    public void exhale() {
        System.out.println("Lung exhaling");
        Main.calories -= 5;
    }

    public void run() {
        while(Main.calories > 0) {
            try {
                inhale();
                Thread.sleep(3000);
                exhale();
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Lung interrupted: " + ex);
            }
        }
    }
}
