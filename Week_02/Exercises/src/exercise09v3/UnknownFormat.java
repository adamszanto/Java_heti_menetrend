package exercise09v3;

import exercise09v2.FileHandler;

import java.util.Random;

public class UnknownFormat implements FileHandler {
    @Override
    public boolean process(String extension) {
        System.out.println("Further investigation of..." + extension);
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
        return true;
    }
}
