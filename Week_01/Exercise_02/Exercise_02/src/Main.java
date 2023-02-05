import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Futoverseny futoverseny = new Futoverseny();
        Csapat csapat1 = new Csapat();
        Csapat csapat2 = new Csapat();
        Csapat csapat3 = new Csapat();
        Varolista varolista2 = new Varolista(2);
        Varolista varolista3 = new Varolista(3);

        futoverseny.start();

        while(futoverseny.getLetszam() > futoverseny.getJelentkezok()) {
            futoverseny.jelentkezes();
        }

        System.out.println("Lezarult jelentkezes. Csapatok listája: ");
    }
}