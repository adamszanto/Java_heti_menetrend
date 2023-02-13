package exercise09;

import java.util.Random;

public class UnknownFormat extends File{
    public UnknownFormat(String name) {
        super(name);
    }

    public void process() {
        System.out.println("Further investigation...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        boolean flag = random.nextBoolean();
        if(flag) {
            System.out.println("Accepted.");
        } else {
            System.out.println("Rejected.");
        }
    }
}
