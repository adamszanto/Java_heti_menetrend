package Exercise_00_LungAndEyes;

public class Lungs extends Thread{
    private Integer value;

    public Lungs(Integer object) {
        this.value = object;
    }

    public void inhale() {
        System.out.println("Lung inhaling");
        value -= 5;
    }

    public void exhale() {
        System.out.println("Lung exhaling");
        value -= 5;
    }

    public void run() {
        while(value > 0) {
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
