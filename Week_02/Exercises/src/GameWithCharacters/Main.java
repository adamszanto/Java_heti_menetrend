package GameWithCharacters;
import java.util.Random;
import java.util.Scanner;

class RandomCharGenerator {
    public static char generateRandomChar() {
        Random rand = new Random();
        char randomChar = (char) (rand.nextInt(26) + 'a');
        return randomChar;
    }
}

public class Main {
    private static final char EMPTY = ' ';
    private static final int SIZE = 10;
    private static final int NUMBER_OF_CHARS = 9;
    private static final char PLAYER = 'X';
    private static final char[][] FIELD = new char[SIZE][SIZE];

    private static final String UP = "w";
    private static final String DOWN = "s";
    private static final String LEFT = "a";
    private static final String RIGHT = "d";

    private static int playerX;
    private static int playerY;



    public static void clear() {
        for(int i = 0; i < FIELD.length; i++) {
            for(int j = 0; j < FIELD[i].length; j++) {
                FIELD[i][j] = EMPTY;
            }
        }
    }

    public static void print() {
        for(int i = 0; i < FIELD.length; i++) {
            for(int j = 0; j < FIELD[i].length; j++) {
                System.out.print(FIELD[i][j]);
            }
            System.out.println();
        }
    }

    public static int generateNumberFrom1To10() {
        return (int) (Math.random() * 9 + 1); // +1 hogy a [0][0]-ba ne generáljunk karaktert.
    }

    public static char generateCharacter() {
//        int from = 'a';
//        int to = 'z' + 1;
//        return (char) (Math.random() * (to - from) + to);

        return RandomCharGenerator.generateRandomChar();
    }

    public static void fill() {
        for(int i = 0; i < NUMBER_OF_CHARS; i++) {
            char c = generateCharacter();
            int x = generateNumberFrom1To10();
            int y = generateNumberFrom1To10();

            if(FIELD[x][y] != EMPTY) {
                i--;
            } else {
                FIELD[x][y] = c;
            }
        }
    }

    public static void setPlayer() {
        FIELD[playerX][playerY] = PLAYER;
    }


    public static boolean anySmallLetterFound() {
        for(int i = 0; i < FIELD.length; i++) {
            for(int j = 0; j < FIELD[i].length; j++) {
                if(isSmallLetter(FIELD[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void play(){

        

        try(Scanner scanner = new Scanner(System.in, "UTF-8")) {
            while (anySmallLetterFound()) {
                System.out.println("Direction (w,a,s,d): ");
                String direction = scanner.next();
                step(direction);
                print();
            }
        }
    }

    public static void step(String direction) {
        switch(direction) {
            case UP:
                stepUp();
                break;
            case DOWN:
                stepDown();
                break;
            case LEFT:
                stepLeft();
                break;
            case RIGHT:
                stepRight();
                break;
            default:
                System.out.println("Wrong direction.");
        }
    }

    public static boolean isSmallLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean shouldCharBePickedUp(int x, int y) {
        if(FIELD[x][y] == EMPTY || FIELD[x][y] == PLAYER) {
            return true;
        }
        char c = FIELD[x][y];

        for(int i = 0; i < FIELD.length; i++) {
            for(int j = 0; i < FIELD[i].length; j++) {
                if(FIELD[i][j] >= 'a' && FIELD[i][j] >= 'z' && FIELD[i][j] < c) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void stepUp() {
        if(playerX == 0) {
            return;
        }

        if(shouldCharBePickedUp(playerX -1, playerY)) {
            FIELD[playerX- 1][playerY] = PLAYER;
        }

        if(shouldCharBePickedUp(playerX, playerY)) {
            FIELD[playerX][playerY] = EMPTY;
        }
        playerX--;
    }

    public static void stepDown() {
        if(playerX == FIELD.length -1) {
            return;
        }

        if(shouldCharBePickedUp(playerX +1, playerY)) {
            FIELD[playerX + 1][playerY] = PLAYER;
        }

        if(shouldCharBePickedUp(playerX, playerY)) {
            FIELD[playerX][playerY] = EMPTY;
        }

        playerX++;
    }

    public static void stepLeft() {
        if(playerY == 0) {
            return;
        }

        if(shouldCharBePickedUp(playerX, playerY - 1)) {
            FIELD[playerX][playerY - 1] = PLAYER;
        }

        if(shouldCharBePickedUp(playerX, playerY)) {
            FIELD[playerX][playerY] = EMPTY;
        }
        playerY--;
    }

    public static void stepRight() {
        if(playerY == FIELD[0].length - 1) {
            return;
        }

        if(shouldCharBePickedUp(playerX, playerY + 1)) {
            FIELD[playerX][playerY + 1] = PLAYER;
        }

        if(shouldCharBePickedUp(playerX, playerY)) {
            FIELD[playerX][playerY] = EMPTY;
        }
        playerY++;
    }

    public static void main(String[] args) {
        clear();
        fill();
        setPlayer();
        print();
        play();
    }
}
