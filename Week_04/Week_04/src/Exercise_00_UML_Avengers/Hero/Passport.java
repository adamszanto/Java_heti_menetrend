package Exercise_00_UML_Avengers.Hero;

import java.util.Random;

public class Passport {
    private String id;

    public Passport() {
        Random random = new Random();
        int passportNum = random.nextInt(900000) + 100000;
        id = Integer.toString(passportNum);
    }

    public String getId() {
        return id;
    }
}
