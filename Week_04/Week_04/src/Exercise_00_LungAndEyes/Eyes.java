package Exercise_00_LungAndEyes;

public class Eyes extends Thread {
    private Integer value;
    public Eyes(Integer object) {
        this.value = object;
    }

    public void blink() {
        System.out.println("Eye blinks");
        value -= 5;
    }

    public void run() {
        while(value > 0){
            try {
                blink();
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                System.out.println("Eye interrupted " + ex);
            }
        }
    }
}
