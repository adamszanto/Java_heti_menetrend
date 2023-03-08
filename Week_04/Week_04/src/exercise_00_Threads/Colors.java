package exercise_00_Threads;

import java.util.Random;

public class Colors {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String getRandomColor() {
        String[] colors = {
                ANSI_BLACK,
                ANSI_RED,
                ANSI_GREEN,
                ANSI_YELLOW,
                ANSI_BLUE,
                ANSI_PURPLE,
                ANSI_CYAN,
                ANSI_WHITE };

        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}

