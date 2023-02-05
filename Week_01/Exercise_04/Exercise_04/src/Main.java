import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] map = new char[10][10];
        int x = 0;
        int y = 0;
        int lepesek = 0;

        ArrayList<Character> betuk = new ArrayList<>();
        for (int i = 65; i < 85; i++) {
            betuk.add((char) i);
        }
        Collections.shuffle(betuk);

        ArrayList<Character> begyujtottBetuk = new ArrayList<>();

        Random random = new Random();
        int betuIndex = 0;

        while (betuIndex < 9) {
            int i = random.nextInt(9) +1;
            int j = random.nextInt(9) + 1;
            map[i][j] = betuk.get(betuIndex);
            betuIndex++;
        }



        while(begyujtottBetuk.size() < 9) {
            System.out.println("Lepesek szama: " + lepesek);

            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    if(i == x && j == y) {
                        System.out.print("[X]");
                    } else {
                        System.out.print("[" + map[i][j] +"]");
                    }
                }
                System.out.println();
            }

            System.out.println("Mozogj a W-A-S-D billentyuvel: ");
            char lepes = scanner.next().toUpperCase().charAt(0);

        }
    }
}

