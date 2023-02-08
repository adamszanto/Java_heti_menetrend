import java.lang.reflect.Array;
import java.util.*;
public class Main {
    private static final int ASCII_VALUE_A = 65;
    private static final int ASCII_VALUE_Z = 90;
    private static final int NUMBEROF_RANDOM_GENERATED_CHARS = 9;
    private static final char EMPTY_CELL = '\0';

    public static void main(String[] args) {


        // try szerkezetbe be kell raknom, ez a típusú try automatikusan lezárja az erőforrásokat.
        // try-with-resources

        try(Scanner scanner = new Scanner(System.in)) {

            char[][] map = new char[10][10];
            int playerCoordX = 0;
            int playerCoordY = 0;
            int lepesek = 0;

            List<Character> betuk = new ArrayList<>();

            for (int i = ASCII_VALUE_A; i < ASCII_VALUE_Z; i++) {
                betuk.add((char) i);
            }

            Collections.shuffle(betuk);

            List<Character> begyujtottBetuk = new ArrayList<>();

            Random random = new Random();
            int betuIndex = 0;

            List<Character> abcBetuk = new ArrayList<>();

            while (betuIndex < NUMBEROF_RANDOM_GENERATED_CHARS) {
                int i = random.nextInt(NUMBEROF_RANDOM_GENERATED_CHARS) + 1;
                int j = random.nextInt(NUMBEROF_RANDOM_GENERATED_CHARS) + 1;


                if (i != 1 && j != 1 && map[i][j] == EMPTY_CELL) {
                    map[i][j] = betuk.get(betuIndex);
                    abcBetuk.add(map[i][j]);
                    betuIndex++;
                }
            }

            Collections.sort(abcBetuk);
            System.out.println("Abc betuk: " + abcBetuk);
            System.out.println("Begyujtott betuk: " + begyujtottBetuk);

            while (begyujtottBetuk.size() < NUMBEROF_RANDOM_GENERATED_CHARS) {
                System.out.println("Lepesek szama: " + lepesek);

                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[0].length; j++) {
                        if (i == playerCoordX && j == playerCoordY) {
                            System.out.print("[X]");
                        } else {
                            System.out.print("[" + map[i][j] + "]");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Mozogj a W-A-S-D billentyuvel: ");
                char lepes = scanner.next().toUpperCase().charAt(0);
                switch (lepes) {
                    case 'W':
                        if (playerCoordX > 0) {
                            playerCoordX--;
                            lepesek++;
                        }
                        break;
                    case 'S':
                        if (playerCoordX < 9) {
                            playerCoordX++;
                            lepesek++;
                        }
                        break;
                    case 'A':
                        if (playerCoordY > 0) {
                            playerCoordY--;
                            lepesek++;
                        }
                        break;
                    case 'D':
                        if (playerCoordY < 9) {
                            playerCoordY++;
                            lepesek++;
                        }
                        break;
                }
                if (map[playerCoordX][playerCoordY] == abcBetuk.get(begyujtottBetuk.size())) {
                    begyujtottBetuk.add(map[playerCoordX][playerCoordY]);
                    map[playerCoordX][playerCoordY] = EMPTY_CELL;
                }
            }
            System.out.println("SIKER! " + lepesek + " lepessel.");
        }
    }
}

