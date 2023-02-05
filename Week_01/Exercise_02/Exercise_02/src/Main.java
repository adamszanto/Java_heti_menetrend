import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int letszam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Futoverseny letszama: ");
        letszam = scanner.nextInt();

        Futoverseny futoverseny = new Futoverseny(letszam);

        System.out.println("Futoverseny elkeszult! Maximalis letszam: " + futoverseny.getLetszam());
    }
}