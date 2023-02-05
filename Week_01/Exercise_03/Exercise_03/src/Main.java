import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int fejSzamlalo = 0;
        int irasSzamlalo = 0;

        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            int eredmeny = random.nextInt(2);

            if(eredmeny == 0) {
                System.out.println("Fej!");
                fejSzamlalo++;
            } else {
                System.out.println("Írás!");
                irasSzamlalo++;
            }
        }

        System.out.println("Fej: " + fejSzamlalo);
        System.out.println("Irás: " + irasSzamlalo);
    }
}